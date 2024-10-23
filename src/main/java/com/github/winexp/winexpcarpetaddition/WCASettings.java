package com.github.winexp.winexpcarpetaddition;

import carpet.api.settings.Rule;

public class WCASettings {
    private static class Categories {
        public static final String WCA = "wca";
        public static final String Bugfix = "bugfix";
    }

    @Rule(categories = {Categories.WCA, Categories.Bugfix})
    public static boolean largeOakGenerationFix = false;
}
