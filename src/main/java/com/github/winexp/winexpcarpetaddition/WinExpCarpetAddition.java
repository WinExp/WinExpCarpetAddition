package com.github.winexp.winexpcarpetaddition;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class WinExpCarpetAddition implements ModInitializer {
    public static final String MOD_ID = "wca";
    public static final String MOD_NAME = "WinExp Carpet Addition";
    public static String VERSION;

    @Override
    public void onInitialize() {
        VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(RuntimeException::new).getMetadata().getVersion().getFriendlyString();
        WCAExtension.init();
    }
}
