package com.maideniles.maidensmerrymaking.blocks;

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
import net.minecraftforge.common.property.Properties;

public class TreeStandBlock extends Block {

    protected static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 3.0D, 13.0D);



    public TreeStandBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }




    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack tree = player.getItemInHand(handIn);

        if (!level.isClientSide()) {



            if (tree.getItem() == ModItems.CHRISTMAS_TREE.get()){

                System.out.println("O CHRISTMAS TREE, O CHRISTMAS TREE!");
                level.setBlock(pos, ModBlocks.CHRISTMAS_TREE_BOTTOM.get().defaultBlockState(),3);
                level.setBlock(pos.offset(0,1,0), ModBlocks.CHRISTMAS_TREE_MIDDLE.get().defaultBlockState(),3);
                level.setBlock(pos.offset(0,2,0), ModBlocks.CHRISTMAS_TREE_TOP.get().defaultBlockState(),3);

                tree.shrink(1);
            }



        }




        return InteractionResult.FAIL;
    }

}
