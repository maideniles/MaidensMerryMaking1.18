package com.maideniles.maidensmerrymaking.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModItemGroups {

    public static final CreativeModeTab MAIDENS_BLOCKS_GROUP = new CreativeModeTab("maidens_blocks_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get());
        }
    };

    public static final CreativeModeTab MAIDENS_ITEMS_GROUP = new CreativeModeTab("maidens_items_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MINI_LIGHTS_MULTI.get());
        }
    };

}
