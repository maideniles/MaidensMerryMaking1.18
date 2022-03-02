package com.maideniles.maidensmerrymaking.blocks.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TopperBlock extends Block {

    protected static final VoxelShape TOPPER_AABB = Block.box(0.0D, -3.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    public TopperBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        return TOPPER_AABB;
    }


}
