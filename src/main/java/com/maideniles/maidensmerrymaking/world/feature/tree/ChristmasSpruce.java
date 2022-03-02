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

public class ChristmasSpruce extends Feature<NoneFeatureConfiguration> {
    public ChristmasSpruce(Codec<NoneFeatureConfiguration> p_67201_) {
        super(p_67201_);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> placeContext) {
        int k = 0;
        int i = 0;
        int j = 0;

        WorldGenLevel world = placeContext.level();
        BlockPos position = placeContext.origin();

        if(!isWater(world, position.below()) && isDirt(world.getBlockState(position.below()))) {
            this.setBlock(world, position.offset(i + 0, j + 0, k + 0),
                    ModBlocks.TREE.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 1, k + 0),
                    ModBlocks.TREE_MIDDLE.get().defaultBlockState());
            this.setBlock(world, position.offset(i + 0, j + 2, k + 0),
                    ModBlocks.TREE_TOP.get().defaultBlockState());
        }
        return true;
    }

    protected static boolean isWater(LevelSimulatedRW worldIn, BlockPos pos) {
        return worldIn.isStateAtPosition(pos, (p_214583_0_) -> {
            return p_214583_0_.getBlock() == Blocks.WATER;
        });
    }
}
