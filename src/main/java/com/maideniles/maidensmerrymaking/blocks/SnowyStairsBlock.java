package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SnowyStairsBlock extends StairBlock {
    public SnowyStairsBlock(BlockState state, Properties properties) {
        super(state, properties);
    }



    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack snow = player.getItemInHand(handIn);
        BlockState blockstate = level.getBlockState(pos);

        if (!level.isClientSide()) {

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_ACACIA_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_ACACIA_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_BIRCH_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_BIRCH_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_DARK_OAK_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_DARK_OAK_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_JUNGLE_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_JUNGLE_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_OAK_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_OAK_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_SPRUCE_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_SPRUCE_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_WARPED_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_WARPED_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_CRIMSON_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_CRIMSON_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_POLISHED_BLACKSTONE_BRICK_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_POLISHED_BLACKSTONE_BRICK_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_DEEPSLATE_BRICK_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_DEEPSLATE_BRICK_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }

            if (snow.getItem() == Items.SNOWBALL && blockstate.getBlock() == ModBlocks.ROOF_STONE_BRICK_STAIRS.get() ) {
                System.out.println("GO GO SNOWY STAIRS!!");
                level.setBlock(pos, ModBlocks.SNOWY_STONE_BRICK_STAIRS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(HALF, state.getValue(HALF)).setValue(SHAPE, state.getValue(SHAPE)),3);
                snow.shrink(1);
            }
        }
        return InteractionResult.FAIL;
    }

}
