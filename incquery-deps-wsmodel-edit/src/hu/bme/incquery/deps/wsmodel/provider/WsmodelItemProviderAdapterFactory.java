/**
 */
package hu.bme.incquery.deps.wsmodel.provider;

import hu.bme.incquery.deps.wsmodel.util.WsmodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WsmodelItemProviderAdapterFactory extends WsmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WsmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WProjectItemProvider wProjectItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWProjectAdapter() {
		if (wProjectItemProvider == null) {
			wProjectItemProvider = new WProjectItemProvider(this);
		}

		return wProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WWorkspace} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WWorkspaceItemProvider wWorkspaceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WWorkspace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWWorkspaceAdapter() {
		if (wWorkspaceItemProvider == null) {
			wWorkspaceItemProvider = new WWorkspaceItemProvider(this);
		}

		return wWorkspaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WDependencyItemProvider wDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWDependencyAdapter() {
		if (wDependencyItemProvider == null) {
			wDependencyItemProvider = new WDependencyItemProvider(this);
		}

		return wDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WPackageFragmentRootItemProvider wPackageFragmentRootItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WPackageFragmentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWPackageFragmentRootAdapter() {
		if (wPackageFragmentRootItemProvider == null) {
			wPackageFragmentRootItemProvider = new WPackageFragmentRootItemProvider(this);
		}

		return wPackageFragmentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WPackageFragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WPackageFragmentItemProvider wPackageFragmentItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WPackageFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWPackageFragmentAdapter() {
		if (wPackageFragmentItemProvider == null) {
			wPackageFragmentItemProvider = new WPackageFragmentItemProvider(this);
		}

		return wPackageFragmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WCompilationUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WCompilationUnitItemProvider wCompilationUnitItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WCompilationUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWCompilationUnitAdapter() {
		if (wCompilationUnitItemProvider == null) {
			wCompilationUnitItemProvider = new WCompilationUnitItemProvider(this);
		}

		return wCompilationUnitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WTypeItemProvider wTypeItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWTypeAdapter() {
		if (wTypeItemProvider == null) {
			wTypeItemProvider = new WTypeItemProvider(this);
		}

		return wTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WMethodItemProvider wMethodItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWMethodAdapter() {
		if (wMethodItemProvider == null) {
			wMethodItemProvider = new WMethodItemProvider(this);
		}

		return wMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.incquery.deps.wsmodel.WField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WFieldItemProvider wFieldItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.incquery.deps.wsmodel.WField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWFieldAdapter() {
		if (wFieldItemProvider == null) {
			wFieldItemProvider = new WFieldItemProvider(this);
		}

		return wFieldItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (wProjectItemProvider != null) wProjectItemProvider.dispose();
		if (wWorkspaceItemProvider != null) wWorkspaceItemProvider.dispose();
		if (wDependencyItemProvider != null) wDependencyItemProvider.dispose();
		if (wPackageFragmentRootItemProvider != null) wPackageFragmentRootItemProvider.dispose();
		if (wPackageFragmentItemProvider != null) wPackageFragmentItemProvider.dispose();
		if (wCompilationUnitItemProvider != null) wCompilationUnitItemProvider.dispose();
		if (wTypeItemProvider != null) wTypeItemProvider.dispose();
		if (wMethodItemProvider != null) wMethodItemProvider.dispose();
		if (wFieldItemProvider != null) wFieldItemProvider.dispose();
	}

}
