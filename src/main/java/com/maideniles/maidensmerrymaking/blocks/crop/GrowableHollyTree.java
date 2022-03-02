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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class GrowableHollyTree extends Block implements BonemealableBlock {

    protected static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public GrowableHollyTree(Properties p_48957_) {
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

        //PLACE TRUNK//
        pLevel.setBlock(pState, Blocks.SPRUCE_LOG.defaultBlockState(), 3);
        pLevel.setBlock(pState.above(),  Blocks.SPRUCE_LOG.defaultBlockState(), 3);
        pLevel.setBlock(pState.above(2),  Blocks.SPRUCE_LOG.defaultBlockState(), 3);
        pLevel.setBlock(pState.above(3),  Blocks.SPRUCE_LOG.defaultBlockState(), 3);
        pLevel.setBlock(pState.above(4),  Blocks.SPRUCE_LOG.defaultBlockState(), 3);
        pLevel.setBlock(pState.above(5),  Blocks.SPRUCE_LOG.defaultBlockState(), 3);
        pLevel.setBlock(pState.above(6),  Blocks.SPRUCE_LOG.defaultBlockState(), 3);
//LAYER 1 LEAVES//
//ROW 1//
        pLevel.setBlock(pState.offset(-1,1,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,1,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,1,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 2//
        pLevel.setBlock(pState.offset(-2,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,1,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 3//
        pLevel.setBlock(pState.offset(-2,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,1,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 4//
        pLevel.setBlock(pState.offset(-2,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,1,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 5//
        pLevel.setBlock(pState.offset(-1,1,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,1,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,1,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//PLACE LAYER 2  LEAVES//
        //ROW 1//
        pLevel.setBlock(pState.offset(-1,2,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,2,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,2,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 2//
        pLevel.setBlock(pState.offset(-2,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,2,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 3//
        pLevel.setBlock(pState.offset(-2,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,2,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 4//
        pLevel.setBlock(pState.offset(-2,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,2,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 5//
        pLevel.setBlock(pState.offset(-1,2,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,2,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,2,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);

//PLACE LAYER 3 LEAVES//
        //ROW 1//
        pLevel.setBlock(pState.offset(0,3,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 2//
        pLevel.setBlock(pState.offset(-1,3,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,3,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,3,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 3//
        pLevel.setBlock(pState.offset(-2,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,3,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 4//
        pLevel.setBlock(pState.offset(-1,3,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,3,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,3,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 5//
        pLevel.setBlock(pState.offset(0,3,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
 //PLACE LAYER 4 LEAVES//
        //ROW 1//
        pLevel.setBlock(pState.offset(0,4,-2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 2//
        pLevel.setBlock(pState.offset(-1,4,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,4,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,4,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 3//
        pLevel.setBlock(pState.offset(-2,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(-1,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(2,4,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 4//
        pLevel.setBlock(pState.offset(-1,4,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,4,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,4,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 5//
        pLevel.setBlock(pState.offset(0,4,2),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//PLACE LAYER 5 LEAVES//
        //ROW 1//
        pLevel.setBlock(pState.offset(-1,5,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,5,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,5,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
//ROW 2//
        pLevel.setBlock(pState.offset(-1,5,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,5,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
 //ROW 3//
        pLevel.setBlock(pState.offset(-1,5,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,5,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,5,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
    //PLACE LAYER 6 LEAVES//
        pLevel.setBlock(pState.offset(-1,6,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(1,6,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,6,1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        pLevel.setBlock(pState.offset(0,6,-1),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);
        //PLACE TOP LEAVES//
        pLevel.setBlock(pState.offset(0,7,0),  ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState(), 3);

    }

    @Override
    public boolean isRandomlyTicking(BlockState pState) {
        return true;
    }
}
