package com.example.dsafinals.util;

import java.util.prefs.Preferences;

public final class SettingsManager {
    private static final Preferences PREFS = Preferences.userNodeForPackage(SettingsManager.class);
    private static final String DIRECTORY_PATH_KEY = "directoryPath";

    private SettingsManager() {}

    public static void saveDirectoryPath(String path) {
        PREFS.put(DIRECTORY_PATH_KEY, path);
    }

    public static String loadDirectoryPath() {
        return PREFS.get(DIRECTORY_PATH_KEY, System.getProperty("user.home"));
    }
}
