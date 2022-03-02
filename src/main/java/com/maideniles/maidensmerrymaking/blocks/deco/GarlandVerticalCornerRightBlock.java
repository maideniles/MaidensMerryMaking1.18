package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.util.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class GarlandVerticalCornerRightBlock extends HorizontalDecoBlock{

    protected static final VoxelShape EAST_AABB = Block.box(10.0D, 0.0D, 8.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape WEST_AABB = Block.box(0.0D, 0.0D, 0.0D, 6.0D, 16.0D, 8.0D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 10.0D, 8.0D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(8.0D, 0.0D, 0.0D, 16.0D, 16.0D, 6.0D);

    protected static final VoxelShape NORTH_TOP_AABB = Block.box(0, 8, 0, 16, 16, 6);
    protected static final VoxelShape SOUTH_TOP_AABB = Block.box(0, 8, 10, 16, 16, 16);
    protected static final VoxelShape WEST_TOP_AABB = Block.box(0, 8, 0, 6, 16, 16);
    protected static final VoxelShape EAST_TOP_AABB = Block.box(10, 8, 0, 16, 16, 16);

    public static VoxelShape WITH_TOP_WEST;
    public static VoxelShape WITH_TOP_EAST;
    public static VoxelShape WITH_TOP_NORTH;
    public static VoxelShape WITH_TOP_SOUTH;

    public GarlandVerticalCornerRightBlock(Properties properties) {
        super(properties);

        WITH_TOP_WEST = Shapes.join( WEST_AABB, WEST_TOP_AABB, BooleanOp.OR);
        WITH_TOP_EAST = Shapes.join( EAST_AABB, EAST_TOP_AABB, BooleanOp.OR);
        WITH_TOP_NORTH = Shapes.join( NORTH_AABB, NORTH_TOP_AABB, BooleanOp.OR);
        WITH_TOP_SOUTH = Shapes.join( SOUTH_AABB, SOUTH_TOP_AABB, BooleanOp.OR);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {
            case SOUTH:
                return WITH_TOP_SOUTH;
            case NORTH:
            default:
                return WITH_TOP_NORTH;
            case WEST:
                return WITH_TOP_WEST;
            case EAST:
                return WITH_TOP_EAST;
        }
    }






}
