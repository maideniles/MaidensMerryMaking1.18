package com.maideniles.maidensmerrymaking.blocks.lamppost;

import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LampPostPole extends HorizontalDecoBlock {

    protected static final VoxelShape SHAPE = Block.box(7.0D, 0.0D, 7.0D, 9.0D, 16.0D, 9.0D);


    public LampPostPole(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_49573_) {
        return this.defaultBlockState().setValue(FACING, p_49573_.getHorizontalDirection());
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack item = player.getItemInHand(handIn);
        if (!level.isClientSide()) {

            if (item.getItem() == Item.byBlock(ModBlocks.CHRISTMAS_WREATH.get()) ){
                System.out.println("WREATH");
                level.setBlock(pos, ModBlocks.LAMP_POST_POLE_WREATH.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
               item.shrink(1);
            }

            if (item.getItem() == Item.byBlock(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get()) ){
                System.out.println("WREATH WHITE LIGHTS");
                level.setBlock(pos, ModBlocks.LAMP_POST_POLE_WREATH_WHITE.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
                item.shrink(1);
            }

            if (item.getItem() == Item.byBlock(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get())){
                System.out.println("WREATH MULTI LIGHTS");
                level.setBlock(pos, ModBlocks.LAMP_POST_POLE_WREATH_MULTI.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
                item.shrink(1);
            }

            if (item.getItem() == ModItems.BOW.get()){
                System.out.println("POST WITH BOW");
                level.setBlock(pos, ModBlocks.LAMP_POST_POLE_BOW.get().defaultBlockState().setValue(FACING, state.getValue(FACING)),3);
                item.shrink(1);
            }

        }
        return InteractionResult.FAIL;
    }




    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_BOW.get()) {
            popResource(level, pos, new ItemStack(ModItems.BOW.get()));
                }

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_WREATH.get()) {
            popResource(level, pos, new ItemStack(Item.byBlock(ModBlocks.CHRISTMAS_WREATH.get())));
        }

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_WREATH_WHITE.get()) {
            popResource(level, pos, new ItemStack(Item.byBlock(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get())));
        }

        if (blockstate.getBlock() == ModBlocks.LAMP_POST_POLE_WREATH_MULTI.get()) {
            popResource(level, pos, new ItemStack(Item.byBlock(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get())));
        }
    }


}
