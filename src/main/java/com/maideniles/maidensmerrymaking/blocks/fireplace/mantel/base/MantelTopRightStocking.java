package com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base;

import com.maideniles.maidensmerrymaking.blocks.deco.MantelDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MantelTopRightStocking extends MantelDecoBlock {
    protected static final VoxelShape WEST_AABB = Block.box(0.0D, 8.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(7.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 8.0D, 7.0D, 16.0D, 16.0D, 16.0D);

    private static final VoxelShape LEG_WEST_AABB = Block.box(0.0D, 0.0D, 2.0D, 8.0D, 8.0D, 8.0D);
    private static final VoxelShape LEG_EAST_AABB = Block.box(8.0D, 0.0D, 8.0D, 16.0D, 8.0D, 14.0D);
    private static final VoxelShape LEG_NORTH_AABB = Block.box(8.5D, 0.0D, 0.0D, 14.5D, 8.0D, 8.0D);
    private static final VoxelShape LEG_SOUTH_AABB = Block.box(2.0D, 0.0D, 8.0D, 8.0D, 8.0D, 16.0D);

    public static VoxelShape WITH_LEG_WEST;
    public static VoxelShape WITH_LEG_EAST;
    public static VoxelShape WITH_LEG_NORTH;
    public static VoxelShape WITH_LEG_SOUTH;

    public static final BooleanProperty STOCKING = BooleanProperty.create("stocking");

    public MantelTopRightStocking(Properties properties) {
        super(properties);

        WITH_LEG_WEST = Shapes.join( WEST_AABB, LEG_WEST_AABB, BooleanOp.OR);
        WITH_LEG_EAST = Shapes.join( EAST_AABB, LEG_EAST_AABB, BooleanOp.OR);
        WITH_LEG_NORTH = Shapes.join( NORTH_AABB, LEG_NORTH_AABB, BooleanOp.OR);
        WITH_LEG_SOUTH = Shapes.join( SOUTH_AABB, LEG_SOUTH_AABB, BooleanOp.OR);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {
            case SOUTH:
                return WITH_LEG_SOUTH;
            case NORTH:
            default:
                return WITH_LEG_NORTH;
            case WEST:
                return WITH_LEG_WEST;
            case EAST:
                return WITH_LEG_EAST;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_49573_) {
        return this.defaultBlockState().setValue(FACING, p_49573_.getHorizontalDirection().getOpposite()).setValue(STOCKING,Boolean.FALSE);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult pHit) {


        ItemStack stocking = player.getItemInHand(hand);

        if (!level.isClientSide()) {


            if (stocking.isEmpty()) {
                level.setBlock(pos, this.defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(STOCKING, Boolean.FALSE), 3);


                player.getInventory().add(new ItemStack(ModItems.STOCKING.get()));
                return InteractionResult.PASS;
            }

            if (stocking.getItem() == ModItems.STOCKING.get()) {

                System.out.println("THE STOCKINGS WERE HUNG");
                level.setBlock(pos, this.defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(STOCKING, Boolean.TRUE), 3);
level.setBlock(pos,this.defaultBlockState().setValue(FACING, state.getValue(MantelTopCenterStocking.FACING)),3);

                stocking.shrink(1);

            }


        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        Boolean top_left = Boolean.TRUE;
        Boolean top_middle = Boolean.TRUE;
        Boolean top_right = Boolean.TRUE;

        if (state.getValue(MantelTopRightStocking.FACING) == Direction.NORTH) {

            if ( top_right == level.getBlockState(pos).getValue(MantelTopRightStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_middle == level.getBlockState(pos.west()).getValue(MantelTopCenterStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_left == level.getBlockState(pos.west(2)).getValue(MantelTopLeftStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block below//
            level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 block  to left//
            level.setBlock(pos.west(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 2 blocks to left//
            level.setBlock(pos.west(2), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 blocks below and 2 blocks to left//
            level.setBlock(pos.below().west(2), Blocks.AIR.defaultBlockState(), 35);

        }

        if (state.getValue(MantelTopRightStocking.FACING) == Direction.SOUTH) {

            if ( top_right == level.getBlockState(pos).getValue(MantelTopRightStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_middle == level.getBlockState(pos.east()).getValue(MantelTopCenterStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_left == level.getBlockState(pos.east(2)).getValue(MantelTopLeftStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block below//
            level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 block to left//
            level.setBlock(pos.east(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 2 blocks to left//
            level.setBlock(pos.east(2), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 block below and 2 blocks to left//
            level.setBlock(pos.below().east(2), Blocks.AIR.defaultBlockState(), 35);

        }

        if (state.getValue(MantelTopRightStocking.FACING) == Direction.EAST) {

           if ( top_right == level.getBlockState(pos).getValue(MantelTopRightStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_middle == level.getBlockState(pos.north()).getValue(MantelTopCenterStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_left == level.getBlockState(pos.north(2)).getValue(MantelTopLeftStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block below//
            level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 block below  left//
            level.setBlock(pos.north(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 2 blocks to left//
            level.setBlock(pos.north(2), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 block below and 2 blocks to left//
            level.setBlock(pos.below().north(2), Blocks.AIR.defaultBlockState(), 35);

        }

        if (state.getValue(MantelTopRightStocking.FACING) == Direction.WEST) {
            if ( top_right == level.getBlockState(pos).getValue(MantelTopRightStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP RIGHT");
            }

            if (top_middle == level.getBlockState(pos.south()).getValue(MantelTopCenterStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP MIDDLE");
            }

            if (top_left == level.getBlockState(pos.south(2)).getValue(MantelTopLeftStocking.STOCKING)) {
                popResource(level, pos, new ItemStack(ModItems.STOCKING.get()));
                System.out.println("DROPPED STOCKING FROM TOP LEFT");
            }

            //destroy block below//
            level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 block below  left//
            level.setBlock(pos.south(), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 2 blocks to left//
            level.setBlock(pos.south(2), Blocks.AIR.defaultBlockState(), 35);
            //destroy block 1 block below and 2 blocks to left//
            level.setBlock(pos.below().south(2), Blocks.AIR.defaultBlockState(), 35);

        }


    }



    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(STOCKING);

    }
}
