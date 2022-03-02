package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.woods;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.blocks.deco.MantelDecoBlock;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.HorizontalMantelBase;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopCenterStocking;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopLeftStocking;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopRightStocking;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class MantelBlockAcacia extends HorizontalMantelBase {
    public MantelBlockAcacia(Properties properties) {
        super(properties);
    }


    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {


        if (state.getValue(this.FACING) == Direction.SOUTH) {


            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_ACACIA_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(-1, 1, 0), ModBlocks.MANTEL_ACACIA_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(1, 1, 0), ModBlocks.MANTEL_ACACIA_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(-1, 0, 0), ModBlocks.MANTEL_ACACIA_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos.offset(1, 0, 0), ModBlocks.MANTEL_ACACIA_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }

        if (state.getValue(this.FACING) == Direction.NORTH) {


            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_ACACIA_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(1, 1, 0), ModBlocks.MANTEL_ACACIA_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(-1, 1, 0), ModBlocks.MANTEL_ACACIA_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(1, 0, 0), ModBlocks.MANTEL_ACACIA_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos.offset(-1, 0, 0), ModBlocks.MANTEL_ACACIA_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }

        if (state.getValue(this.FACING) == Direction.EAST) {


            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_ACACIA_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(0, 1, 1), ModBlocks.MANTEL_ACACIA_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(0, 1, -1), ModBlocks.MANTEL_ACACIA_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(0, 0, 1), ModBlocks.MANTEL_ACACIA_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos.offset(0, 0, -1), ModBlocks.MANTEL_ACACIA_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }

        if (state.getValue(this.FACING) == Direction.WEST) {


            level.setBlockAndUpdate(pos.above(), ModBlocks.MANTEL_ACACIA_TOP_MIDDLE.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopCenterStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(0, 1, -1), ModBlocks.MANTEL_ACACIA_TOP_LEFT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopLeftStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(0, 1, 1), ModBlocks.MANTEL_ACACIA_TOP_RIGHT_STOCKING.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()).setValue(MantelTopRightStocking.STOCKING, Boolean.FALSE));

            level.setBlockAndUpdate(pos.offset(0, 0, -1), ModBlocks.MANTEL_ACACIA_LEG_LEFT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos.offset(0, 0, 1), ModBlocks.MANTEL_ACACIA_LEG_RIGHT.get().defaultBlockState().setValue(DIRECTION, placer.getDirection()));

            level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }

    }


}
