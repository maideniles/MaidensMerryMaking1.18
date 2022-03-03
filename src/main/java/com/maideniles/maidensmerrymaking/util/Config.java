package com.maideniles.maidensmerrymaking.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class Config {
    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec.IntValue CHRISTMAS_PRESENT_CHEST_CHANCE;


static {
ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

presentChestChance(SERVER_BUILDER, CLIENT_BUILDER);

SERVER_CONFIG= SERVER_BUILDER.build();
CLIENT_CONFIG= CLIENT_BUILDER.build();

    }

    private static void presentChestChance(ForgeConfigSpec.Builder SERVER_BUILDER, ForgeConfigSpec.Builder CLIENT_BUILDER) {
        {
            CHRISTMAS_PRESENT_CHEST_CHANCE = CLIENT_BUILDER.comment("Chance for presents to spawn in chests. Set to 0.0 to disable")
                    .defineInRange("christmas_present_chest_chance", 100, 0, Integer.MAX_VALUE);
        }

}
        public static void loadConfigFile(ForgeConfigSpec config, String path)
        {

            final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                    .sync().autosave().writingMode(WritingMode.REPLACE).build();
            file.load();
            config.setConfig(file);

    }

}

