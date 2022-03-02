package com.maideniles.maidensmerrymaking.blocks.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MenorahLitBlock extends HorizontalDecoBlock{

    protected static final VoxelShape WEST_AABB = Block.box(5.5D, 0.0D, 0.0D, 11.5D, 21.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(5.5D, 0.0D, 0.0D, 11.5D, 21.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 5.5D, 16.0D, 21.0D, 11.5D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 5.5D, 16.0D, 21.0D, 11.5D);



    public MenorahLitBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(DIRECTION, context.getHorizontalDirection().getOpposite());

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





    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        popResource(level, pos, new ItemStack(Items.CANDLE,8));

        System.out.println("DROPPED_CANDLES");
    }
}
