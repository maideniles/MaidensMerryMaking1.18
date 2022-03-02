package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SnowySlabBlock extends SlabBlock {
    public SnowySlabBlock(Properties p_56359_) {
        super(p_56359_);
    }



    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack snow = player.getItemInHand(handIn);
        BlockState blockstate = level.getBlockState(pos);

        if (!level.isClientSide()) {

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ACACIA_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.ACACIA_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.BIRCH_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.BIRCH_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.DARK_OAK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.DARK_OAK_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.JUNGLE_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.JUNGLE_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.OAK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.OAK_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.SPRUCE_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SPRUCE_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.WARPED_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.WARPED_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.CRIMSON_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.CRIMSON_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.POLISHED_BLACKSTONE_BRICK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.POLISHED_BLACKSTONE_BRICK_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.DEEPSLATE_BRICK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.DEEPSLATE_BRICK_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.STONE_BRICK_ROOF_SLAB.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.STONE_BRICK_SNOWY_SLAB.get().defaultBlockState().setValue(TYPE, state.getValue(TYPE)),3);
                snow.shrink(1);
            }
        }
        return InteractionResult.FAIL;
    }
}
