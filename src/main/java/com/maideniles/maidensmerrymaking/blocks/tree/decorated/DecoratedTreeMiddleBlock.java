package com.maideniles.maidensmerrymaking.blocks.tree.decorated;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class DecoratedTreeMiddleBlock extends BushBlock {

    protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 16.0D, 14.0D);

    public DecoratedTreeMiddleBlock(Properties properties) {
        super(properties);

    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        Block block = state.getBlock();
        return block == ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get() ||
                block == ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM.get()
                || block == ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM.get();
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
        if (blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get()
        ||blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get()
                || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
        || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM.get()
        || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM.get()
                || blockstate.getBlock() == this && blockstate2.getBlock() == ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM.get()) {

            level.setBlock(pos.below(), Blocks.AIR.defaultBlockState(), 35);
            level.setBlock(pos, Blocks.AIR.defaultBlockState(), 35);
            System.out.println("NO MORE TREE");
        }

    }

}
