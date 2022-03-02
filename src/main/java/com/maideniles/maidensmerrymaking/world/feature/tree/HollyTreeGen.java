package com.maideniles.maidensmerrymaking.world.feature.tree;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import com.maideniles.maidensmerrymaking.init.ModFeatures;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelSimulatedRW;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class HollyTreeGen extends Feature<NoneFeatureConfiguration> {
    public HollyTreeGen(Codec<NoneFeatureConfiguration> p_67201_) {
        super(p_67201_);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> placeContext) {
        int k = 0;
        int i = 0;
        int j = 0;

        WorldGenLevel world = placeContext.level();
        BlockPos position = placeContext.origin();

        if(!isWater(world, position.below()) && isDirt(world.getBlockState(position.below()))) {
          //PLACE TRUNK//
            this.setBlock(world, position.offset(i + 0, j + 0, k + 0),
                    Blocks.SPRUCE_LOG.defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 1, k + 0),
                    Blocks.SPRUCE_LOG.defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 2, k + 0),
                    Blocks.SPRUCE_LOG.defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 3, k + 0),
                    Blocks.SPRUCE_LOG.defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 4, k + 0),
                    Blocks.SPRUCE_LOG.defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 5, k + 0),
                    Blocks.SPRUCE_LOG.defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 6, k + 0),
                    Blocks.SPRUCE_LOG.defaultBlockState());
          //PLACE FIRST LAYER LEAVES//

//ROW 1//
            this.setBlock(world, position.offset(i - 1, j + 1, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 1, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 1, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
//ROW 2//
            this.setBlock(world, position.offset(i - 2, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i - 1, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 1, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


//ROW3//
            this.setBlock(world, position.offset(i - 2, j + 1, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i - 1, j + 1, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 1, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 1, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


     //ROW 4//
            this.setBlock(world, position.offset(i - 2, j + 1, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i - 1, j + 1, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 1, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 1, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 1, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

    //ROW 5//
            this.setBlock(world, position.offset(i - 1, j + 1, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 1, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 1, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


//PLACE SECOND LAYER LEAVES//

            //ROW 1//
            this.setBlock(world, position.offset(i - 1, j + 2, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 2, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 2, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
//ROW 2//
            this.setBlock(world, position.offset(i - 2, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

            this.setBlock(world, position.offset(i - 1, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 2, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


//ROW3//
            this.setBlock(world, position.offset(i - 2, j + 2, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i - 1, j + 2, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 2, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 2, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


            //ROW 4//
            this.setBlock(world, position.offset(i - 2, j + 2, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i - 1, j + 2, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 2, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 2, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 2, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

            //ROW 5//
            this.setBlock(world, position.offset(i - 1, j + 2, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 2, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 2, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

 //PLACE THIRD LAYER LEAVES//

            //ROW 1//

            this.setBlock(world, position.offset(i + 0, j + 3, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

//ROW 2//


            this.setBlock(world, position.offset(i - 1, j + 3, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 3, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 3, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());



//ROW3//
            this.setBlock(world, position.offset(i - 2, j + 3, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i - 1, j + 3, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 3, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 3, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


            //ROW 4//

            this.setBlock(world, position.offset(i - 1, j + 3, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 3, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 3, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


            //ROW 5//

            this.setBlock(world, position.offset(i + 0, j + 3, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


  //PLACE FOURTH ROW LEAVES//

            //ROW 1//

            this.setBlock(world, position.offset(i + 0, j + 4, k - 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

//ROW 2//


            this.setBlock(world, position.offset(i - 1, j + 4, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 4, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 4, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());



//ROW3//
            this.setBlock(world, position.offset(i - 2, j + 4, k +0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i - 1, j + 4, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 4, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 2, j + 4, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


            //ROW 4//

            this.setBlock(world, position.offset(i - 1, j + 4, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 4, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 4, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());


            //ROW 5//

            this.setBlock(world, position.offset(i + 0, j + 4, k + 2),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

//PLACE FIFTH ROW LEAVES//
//ROW 1//
            this.setBlock(world, position.offset(i - 1, j + 5, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 5, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 5, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
//ROW 2//
            this.setBlock(world, position.offset(i - 1, j + 5, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 5, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
//ROW 3//
            this.setBlock(world, position.offset(i - 1, j + 5, k +1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 5, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 5, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

 //PLACE SIXTH ROW LEAVES//
            this.setBlock(world, position.offset(i - 1, j + 6, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 1, j + 6, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 6, k + 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 6, k - 1),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

 //PLACE TOP LEAVES//
            this.setBlock(world, position.offset(i + 0, j + 7, k + 0),
                    ModBlocks.SPRUCE_LEAVES_HOLLY.get().defaultBlockState());

        }
        return true;
    }

    protected static boolean isWater(LevelSimulatedRW worldIn, BlockPos pos) {
        return worldIn.isStateAtPosition(pos, (p_214583_0_) -> {
            return p_214583_0_.getBlock() == Blocks.WATER;
        });
    }
}
