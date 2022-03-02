package com.maideniles.maidensmerrymaking.blocks.tree;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChristmasTreeMiddleBlock extends BushBlock {

    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public ChristmasTreeMiddleBlock(Properties properties) {
        super(properties);

    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        Block block = state.getBlock();
        return block == ModBlocks.CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get()
                || block == ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get();
    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos blockpos = pPos.below();
        if (pState.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return pLevel.getBlockState(blockpos).canSustainPlant(pLevel, blockpos, Direction.UP, this);
        return this.mayPlaceOn(pLevel.getBlockState(blockpos), pLevel, blockpos);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        BlockState blockstate = level.getBlockState(pos);
        BlockState blockstate2 = level.getBlockState(pos.below());
        if (blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.CHRISTMAS_TREE_BOTTOM.get()
        || blockstate2.getBlock() == ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get()
        || blockstate2.getBlock() == ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get()) {
            level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 35);
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 35);
        }

    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack tree = player.getItemInHand(handIn);

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.MINI_LIGHTS_WHITE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos, ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_MIDDLE.get().defaultBlockState(),3);
                 level.setBlock(pos.below(), ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get().defaultBlockState(),3);
                  level.setBlock(pos.above(), ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.MINI_LIGHTS_MULTI.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos, ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_MIDDLE.get().defaultBlockState(),3);
                   level.setBlock(pos.below(), ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get().defaultBlockState(),3);
                     level.setBlock(pos.above(), ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.ORNAMENTS.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos.below(), ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get().defaultBlockState(),3);
                level.setBlock(pos, ModBlocks.DECORATED_CHRISTMAS_TREE_MIDDLE.get().defaultBlockState(),3);
                level.setBlock(pos.above(), ModBlocks.DECORATED_CHRISTMAS_TREE_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.ORNAMENTS_WHITE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos.below(), ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get().defaultBlockState(),3);
                level.setBlock(pos, ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_MIDDLE.get().defaultBlockState(),3);
                level.setBlock(pos.above(), ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }

        }

        return InteractionResult.PASS;
    }





}
