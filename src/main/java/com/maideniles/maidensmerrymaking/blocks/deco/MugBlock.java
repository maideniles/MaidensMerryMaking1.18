package com.maideniles.maidensmerrymaking.blocks.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MugBlock extends HorizontalDecoBlock {

    protected static final VoxelShape WEST_AABB = Block.box(5.5D, 0.0D, 3.5D, 10.5D, 6.0D, 10.5D);
    protected static final VoxelShape EAST_AABB = Block.box(5.5D, 0.0D, 5.5D, 10.5D, 6.0D, 12.5D);
    protected static final VoxelShape NORTH_AABB = Block.box(5.0D, 0.0D, 5.5D, 12.5D, 6.0D, 10.5D);
    protected static final VoxelShape SOUTH_AABB = Block.box(3.5D, 0.0D, 5.5D, 10.5D, 6.0D, 10.5D);

    public MugBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {
            case SOUTH:
                return SOUTH_AABB;
            case NORTH:
            default:
                return NORTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
                return EAST_AABB;
        }
    }
}
