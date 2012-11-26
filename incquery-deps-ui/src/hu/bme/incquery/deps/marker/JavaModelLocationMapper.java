package hu.bme.incquery.deps.marker;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jface.text.Position;


public class JavaModelLocationMapper {

	private final ASTVisitor astWalker = new ASTVisitor() {
		
		@Override
		public boolean visit(MethodDeclaration node) {
			int start = node.getStartPosition();
		
			int bodyLength = 0;
			if (node.getBody() != null) {
				bodyLength = node.getBody().getLength();
			}
			
			int length = node.getLength() - bodyLength;
			IMethodBinding binding = node.resolveBinding();
			
			
			
			String key = binding.getJavaElement().getHandleIdentifier();
			Position value = new Position(start, length);
			positions.put(key, value);
			
			return true;
		}
		
		@Override
		public boolean visit(TypeDeclaration node) {
			int start = node.getStartPosition();
			int length = node.getLength();
			ITypeBinding binding = node.resolveBinding();
			
			String key = binding.getJavaElement().getHandleIdentifier();
			Position value = new Position(start, length);
			positions.put(key, value);
			
			return true;
		}
		
		@Override
		public boolean visit(FieldDeclaration node) {
			int start = node.getStartPosition();
			int length = node.getLength();
			VariableDeclarationFragment vard = (VariableDeclarationFragment) node.fragments().get(0);
			IVariableBinding binding = vard.resolveBinding();
			
			String key = binding.getJavaElement().getHandleIdentifier();
			Position value = new Position(start, length);
			positions.put(key, value);
			
			return true;
		}
		
		
 	};

	private Map<String, Position> positions = Collections.emptyMap();

	private final List<String> tracedProjects;

	public JavaModelLocationMapper(List<String> tracedProjects) {
		this.tracedProjects = tracedProjects;
	}

	public Position position(IJavaElement elem) {
		String key = elem.getHandleIdentifier();
		Position pos = positions.get(key);
		if (pos == null) {
			refresh();
			pos = positions.get(key);
		}
		if (pos == null) {
			return new Position(0);
		}
		
		return pos;
	}
	
	public Position position(String handleIdentifier) {
		String key = handleIdentifier;
		Position pos = positions.get(key);
		if (pos == null) {
			refresh();
			pos = positions.get(key);
		}
		return pos;
	}
	
	public Map<String, Position> currentPositions() {
		return positions;
	}

	public void refresh() {
		// reset the store.
		positions = new HashMap<String, Position>();

		// Find all projects which should be traced.
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = root.getProjects();
		for (IProject project : projects) {
			if (tracedProjects.contains(project.getName())) {
				try {
					addProjectPositions(project);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void addProjectPositions(IProject project) throws CoreException {
		// sanity check
		if (!project.isNatureEnabled("org.eclipse.jdt.core.javanature")) {
			return;
		}

		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragment[] pkgs = javaProject.getPackageFragments();
		for (IPackageFragment pkg : pkgs) {
			for (ICompilationUnit cu : pkg.getCompilationUnits()) {
				@SuppressWarnings("deprecation") // Working with java 1.6
				ASTParser parser = ASTParser.newParser(AST.JLS3);
				parser.setProject(javaProject);
				parser.setResolveBindings(true);
				parser.setSource(cu);
				ASTNode ast = parser.createAST(null);
				ast.accept(astWalker);
			}
		}
	}
}
