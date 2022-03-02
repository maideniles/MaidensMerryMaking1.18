package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.blocks.fireplace.logs.FireplaceLogsOn;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopLeftStocking;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class MkekaWithKinaraBlock extends HorizontalDecoBlock{

    protected static final VoxelShape WEST_AABB = Block.box(5.5D, 0.0D, 0.0D, 11.5D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(5.5D, 0.0D, 0.0D, 11.5D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 5.5D, 16.0D, 16.0D, 11.5D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 5.5D, 16.0D, 16.0D, 11.5D);

    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public MkekaWithKinaraBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(DIRECTION, context.getHorizontalDirection().getOpposite()).setValue(LIT, Boolean.FALSE);

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
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult pHit) {
        Random random = level.getRandom();


        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            if(stack.getItem() == Items.FLINT_AND_STEEL){
                System.out.println("LIT KINARA");
                level.setBlock(pos, ModBlocks.MKEKA_WITH_KINARA_LIT.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(MkekaWithKinaraBlock.LIT, Boolean.TRUE), 3);
              //  level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(),3);
                return InteractionResult.FAIL;
            }


        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(LIT);

    }


    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        popResource(level, pos, new ItemStack(Item.byBlock(ModBlocks.MKEKA.get()), 1));

    }



}
