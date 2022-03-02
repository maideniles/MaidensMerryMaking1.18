package com.maideniles.maidensmerrymaking.blocks.tree;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChristmasTreeBottomBlock extends Block {

    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);



    public ChristmasTreeBottomBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);

        if (blockstate.getBlock() == this ) {

            level.setBlock(pos, ModBlocks.CHRISTMAS_TREE_STAND.get().defaultBlockState(), 35);
        }

    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack tree = player.getItemInHand(handIn);

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.MINI_LIGHTS_WHITE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos, ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get().defaultBlockState(),3);
                  level.setBlock(pos.above(), ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_MIDDLE.get().defaultBlockState(),3);
                  level.setBlock(pos.above(2), ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.MINI_LIGHTS_MULTI.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos, ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get().defaultBlockState(),3);
                      level.setBlock(pos.above(), ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_MIDDLE.get().defaultBlockState(),3);
                       level.setBlock(pos.above(2), ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.ORNAMENTS.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos, ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get().defaultBlockState(),3);
                level.setBlock(pos.above(), ModBlocks.DECORATED_CHRISTMAS_TREE_MIDDLE.get().defaultBlockState(),3);
                level.setBlock(pos.above(2), ModBlocks.DECORATED_CHRISTMAS_TREE_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.ORNAMENTS_WHITE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos, ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get().defaultBlockState(),3);
                level.setBlock(pos.above(), ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_MIDDLE.get().defaultBlockState(),3);
                level.setBlock(pos.above(2), ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        return InteractionResult.PASS;
    }



}
