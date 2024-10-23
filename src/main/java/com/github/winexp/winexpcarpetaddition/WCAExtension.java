package com.github.winexp.winexpcarpetaddition;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import carpet.api.settings.SettingsManager;
import carpet.utils.Translations;

import java.util.Map;

public class WCAExtension implements CarpetExtension {
    private static final SettingsManager SETTINGS_MANAGER = new SettingsManager(
            WinExpCarpetAddition.VERSION,
            WinExpCarpetAddition.MOD_ID,
            WinExpCarpetAddition.MOD_NAME
    );
    private static final WCAExtension INSTANCE = new WCAExtension();

    public static void init() {
        CarpetServer.manageExtension(INSTANCE);
    }

    @Override
    public void onGameStarted() {
        SETTINGS_MANAGER.parseSettingsClass(WCASettings.class);
    }

    @Override
    public String version() {
        return WinExpCarpetAddition.VERSION;
    }

    @Override
    public SettingsManager extensionSettingsManager() {
        return SETTINGS_MANAGER;
    }

    @Override
    public Map<String, String> canHasTranslations(String lang) {
        return Translations.getTranslationFromResourcePath("assets/wca/lang/%s.json".formatted(lang));
    }
}
