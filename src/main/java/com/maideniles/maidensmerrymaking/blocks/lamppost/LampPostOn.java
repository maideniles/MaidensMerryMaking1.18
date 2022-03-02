package com.maideniles.maidensmerrymaking.blocks.lamppost;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class LampPostOn extends HorizontalDecoBlock {

    protected static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);


    public LampPostOn(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_49573_) {
        return this.defaultBlockState().setValue(FACING, p_49573_.getHorizontalDirection());
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)  {


        BlockState blockstate = level.getBlockState(pos.below());
        BlockState blockstate1 = level.getBlockState(pos.below(2));


        if (blockstate.getBlock() == this) {

            level.setBlock(pos.below(), ModBlocks.LAMP_POST_BOTTOM.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
            level.setBlock(pos, ModBlocks.LAMP_POST.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
//THIS ONE WORKS//
        }

        if(blockstate.getBlock() == this && blockstate1.getBlock() == ModBlocks.LAMP_POST_BOTTOM.get()){

            level.setBlock(pos.below(2), ModBlocks.LAMP_POST_POLE.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
            level.setBlock(pos.below(), ModBlocks.LAMP_POST_POLE.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);

            level.setBlock(pos, ModBlocks.LAMP_POST.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);


        }
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {



        ItemStack torch = player.getItemInHand(handIn);

        if (!level.isClientSide()) {

            if (torch.isEmpty() ) {
                System.out.println("DARKNESS FALLS!");
                level.setBlock(pos, ModBlocks.LAMP_POST.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
                torch.shrink(1);
                player.setItemInHand(handIn, new ItemStack(Items.TORCH));
            }
        }
        return InteractionResult.FAIL;
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {


            popResource(level, pos, new ItemStack(Items.TORCH));

        }



}
