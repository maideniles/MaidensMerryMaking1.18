package com.maideniles.maidensmerrymaking.blocks.deco;

import com.maideniles.maidensmerrymaking.blocks.fireplace.logs.FireplaceLogsOn;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class MkekaBlock extends HorizontalDecoBlock{

    protected static final VoxelShape WEST_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);


    public MkekaBlock(Properties properties) {
        super(properties);
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
     //   Random random = level.getRandom();


        ItemStack stack = player.getItemInHand(hand);
        Block block = level.getBlockState(pos).getBlock();

        if (!level.isClientSide()) {
            if (stack.getItem() == Item.byBlock(ModBlocks.KINARA.get())) {
                level.setBlock(pos, ModBlocks.MKEKA_WITH_KINARA.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(MkekaWithKinaraBlock.LIT, Boolean.FALSE), 3);
                level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(), 3);

                System.out.println("PLACED KINARA ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == Item.byBlock(ModBlocks.CHALICE.get())) {
                level.setBlock(pos, ModBlocks.MKEKA_WITH_CHALICE.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(MkekaWithChaliceBlock.CUP, Boolean.TRUE), 3);
                level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(), 3);

                System.out.println("PLACED CHALICE ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == ModItems.CORN.get() && block == ModBlocks.MKEKA.get()) {

                level.setBlock(pos, ModBlocks.MKEKA_WITH_CORN_1.get().defaultBlockState().setValue(FACING, state.getValue(FACING)), 3);
                level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(), 3);

                System.out.println("PLACED CORN ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == ModItems.CORN.get() && block == ModBlocks.MKEKA_WITH_CORN_1.get()) {
                level.setBlock(pos, ModBlocks.MKEKA_WITH_CORN_2.get().defaultBlockState().setValue(FACING, state.getValue(FACING)), 3);
                level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(), 3);

                System.out.println("PLACED 2 CORN ON MAT");
                stack.shrink(1);
            }

            if (stack.getItem() == ModItems.CORN.get() && block == ModBlocks.MKEKA_WITH_CORN_2.get()) {
                level.setBlock(pos, ModBlocks.MKEKA_WITH_CORN_3.get().defaultBlockState().setValue(FACING, state.getValue(FACING)), 3);
                level.setBlock(pos.above(), Blocks.AIR.defaultBlockState(), 3);

                System.out.println("PLACED 3 CORN ON MAT");
                stack.shrink(1);
            }

            return InteractionResult.FAIL;

        }

        return InteractionResult.sidedSuccess(level.isClientSide);


}
    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
Block corn = level.getBlockState(pos).getBlock();

if(corn == ModBlocks.MKEKA_WITH_CORN_1.get()){
    popResource(level, pos, new ItemStack(ModItems.CORN.get(),1));
    System.out.println("DROPPED 1 CORN");
}
        if(corn == ModBlocks.MKEKA_WITH_CORN_2.get()){
            popResource(level, pos, new ItemStack(ModItems.CORN.get(),2));
            System.out.println("DROPPED 2 CORN");
        }

        if(corn == ModBlocks.MKEKA_WITH_CORN_3.get()){
            popResource(level, pos, new ItemStack(ModItems.CORN.get(),3));
            System.out.println("DROPPED 3 CORN");
        }

    }


}
