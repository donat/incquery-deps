/*
 * File PreferenceStore.java.
 * Created by Donat Csikos<dcsikos@cern.ch> at Jul 12, 2012.
 *
 * Copyright CERN 2012, All Rights Reserved.
 */
package hu.bme.incquery.deps.core;

import static hu.bme.incquery.deps.core.Activator.PLUGIN_ID;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class PreferenceStore {

	private final String TRACED_PROJECTS = PLUGIN_ID + ".prefs.TRACED_PROJECTS";
	private final String CACHE_MODIFIED = PLUGIN_ID + ".prefs.CACHE_MODIFIED";

	private static PreferenceStore INSTANCE;

	private PreferenceStore() {
	}
	
	public static PreferenceStore getStore () {
		return INSTANCE == null ? INSTANCE = new PreferenceStore() : INSTANCE;
	}

	public List<String> tracedProjectNames() {
		Preferences preferences = ConfigurationScope.INSTANCE.getNode(PLUGIN_ID);
		String mergedProjectNames = preferences.get(TRACED_PROJECTS, "");
		if ("".equals(mergedProjectNames)) {
			return Collections.emptyList();
		} else {
			return Arrays.asList(mergedProjectNames.split(","));
		}
	}

	public void addTracedProject(String projectName) {
		List<String> projects = new LinkedList<String>(tracedProjectNames());
		projects.add(projectName);
		storeTracedProjects(projects);
	}

	private void storeTracedProjects(List<String> projects) {
		StringBuffer prefToStore = new StringBuffer();
		String sep = "";
		for (String project : projects) {
			prefToStore.append(sep);
			prefToStore.append(project);
			sep = ",";
		}

		Preferences preferences = ConfigurationScope.INSTANCE.getNode(PLUGIN_ID);
		preferences.put(TRACED_PROJECTS, prefToStore.toString());

		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
	
	public void removeTracedProject(String projectName) {
		List<String> projects = new LinkedList<String>(tracedProjectNames());
		projects.remove(projectName);
		storeTracedProjects(projects);
	}
	
	public long getCacheModTime() {
		Preferences preferences = ConfigurationScope.INSTANCE.getNode(PLUGIN_ID);
		return preferences.getLong(CACHE_MODIFIED, -1l);
	}
	
	public void setCacheModTime(long val) {
		Preferences preferences = ConfigurationScope.INSTANCE.getNode(PLUGIN_ID);
		preferences.putLong(CACHE_MODIFIED, val);
		try {
			preferences.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}
}
