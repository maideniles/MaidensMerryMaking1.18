package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MantelDecoBlock extends HorizontalDecoBlock {

    protected static final VoxelShape MANTEL_WEST_AABB = Block.box(0.0D, 0.0D, 0.0D, 9.0D, 12.0D, 16.0D);
    protected static final VoxelShape MANTEL_EAST_AABB = Block.box(7.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape MANTEL_NORTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 9.0D);
    protected static final VoxelShape MANTEL_SOUTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 12.0D, 16.0D);

    public MantelDecoBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {
            case SOUTH:
                return MANTEL_SOUTH_AABB;
            case NORTH:
            default:
                return MANTEL_NORTH_AABB;
            case WEST:
                return MANTEL_WEST_AABB;
            case EAST:
                return MANTEL_EAST_AABB;
        }
    }
}
