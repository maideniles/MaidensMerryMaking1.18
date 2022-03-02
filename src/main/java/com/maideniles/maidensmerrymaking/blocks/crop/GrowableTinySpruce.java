package com.maideniles.maidensmerrymaking.blocks.crop;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class GrowableTinySpruce extends Block implements BonemealableBlock {

    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public GrowableTinySpruce(Properties p_48957_) {
        super(p_48957_);
    }

    /**
     * Get the OffsetType for this Block. Determines if the model is rendered slightly offset.
     */


    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
       return SHAPE;
    }

    /**
     * Performs a random tick on a block.
     */
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        if (pRandom.nextInt(3) == 0 && pLevel.isEmptyBlock(pPos.above()) && pLevel.getRawBrightness(pPos.above(), 0) >= 9) {
            this.growTree(pLevel, pPos);
        }

    }

    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return pLevel.getBlockState(pPos.below()).is(BlockTags.BAMBOO_PLANTABLE_ON);
    }




    public ItemStack getCloneItemStack(BlockGetter pLevel, BlockPos pPos, BlockState pState) {
        return new ItemStack(Items.BAMBOO);
    }

    /**
     * @return whether bonemeal can be used on this block
     */
    public boolean isValidBonemealTarget(BlockGetter pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return pLevel.getBlockState(pPos.above()).isAir();
    }

    public boolean isBonemealSuccess(Level pLevel, Random pRand, BlockPos pPos, BlockState pState) {
        return true;
    }

    public void performBonemeal(ServerLevel pLevel, Random pRand, BlockPos pPos, BlockState pState) {
        this.growTree(pLevel, pPos);
    }


    public float getDestroyProgress(BlockState pState, Player pPlayer, BlockGetter pLevel, BlockPos pPos) {
        return pPlayer.getMainHandItem().canPerformAction(net.minecraftforge.common.ToolActions.SWORD_DIG) ? 1.0F : super.getDestroyProgress(pState, pPlayer, pLevel, pPos);
    }

    protected void growTree(Level pLevel, BlockPos pState) {
        pLevel.setBlock(pState, ModBlocks.TREE.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.above(), ModBlocks.TREE_MIDDLE.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.above(2), ModBlocks.TREE_TOP.get().defaultBlockState(), 3);


    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return true;
    }
}