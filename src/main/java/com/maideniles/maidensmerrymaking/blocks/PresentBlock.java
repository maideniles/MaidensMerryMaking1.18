package com.maideniles.maidensmerrymaking.blocks;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class PresentBlock extends Block {

    protected static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);


    public PresentBlock(Properties p_49795_) {
        super(p_49795_);
    }

    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState pState, Player pPlayer) {
        Random rand = new Random();
        Integer gift_id = rand.nextInt(20);
        Integer gift_count = inclusiveBoundedRandom(rand,1,5);



    if (gift_id== 0){
        popResource(level, pos, new ItemStack(Items.NETHER_STAR,1));

    }
    if(gift_id== 1){
        popResource(level, pos, new ItemStack(Items.SMALL_DRIPLEAF,gift_count));

    }
    if(gift_id== 2){
        popResource(level, pos, new ItemStack(Items.HEART_OF_THE_SEA,1));

        }
    if(gift_id== 3){
        popResource(level, pos, new ItemStack(Items.PRISMARINE_CRYSTALS,gift_count));

        }
    if(gift_id== 4){
        popResource(level, pos, new ItemStack(Item.byBlock(Blocks.DIAMOND_BLOCK), 1));

        }
    if(gift_id== 5){
        popResource(level, pos, new ItemStack(Items.AMETHYST_SHARD,gift_count));

        }
    if(gift_id== 6){
        popResource(level, pos, new ItemStack(Items.POINTED_DRIPSTONE,gift_count));

        }
    if(gift_id== 7){
        popResource(level, pos, new ItemStack(Items.GOLDEN_APPLE,gift_count));

        }
    if(gift_id== 8){
        popResource(level, pos, new ItemStack(Items.DIAMOND,gift_count));

        }
    if(gift_id== 9){
        popResource(level, pos, new ItemStack(Items.GOLD_INGOT,gift_count));

        }
    if(gift_id== 10){
        popResource(level, pos, new ItemStack(Items.EMERALD,gift_count));

        }
    if(gift_id== 11){
        popResource(level, pos, new ItemStack(Items.IRON_INGOT,gift_count));

        }
    if(gift_id== 12){
        popResource(level, pos, new ItemStack(Item.byBlock(Blocks.REDSTONE_BLOCK), gift_count));

        }
    if(gift_id== 13){
        popResource(level, pos, new ItemStack(Items.LAPIS_LAZULI,gift_count));

        }
    if(gift_id== 14){
        popResource(level, pos, new ItemStack(Items.CANDLE,gift_count));

        }
    if(gift_id== 15){
        popResource(level, pos, new ItemStack(Items.HONEY_BOTTLE,gift_count));

        }
    if(gift_id== 16){
        popResource(level, pos, new ItemStack(ModItems.FRUITCAKE.get(),gift_count));

        }
    if(gift_id== 17){
        popResource(level, pos, new ItemStack(Items.NAUTILUS_SHELL,gift_count));

        }
    if(gift_id== 18){
        popResource(level, pos, new ItemStack(Items.LIGHTNING_ROD,gift_count));

        }
    if(gift_id== 19){
        popResource(level, pos, new ItemStack(Items.ENDER_EYE,gift_count));

    }

        if(gift_id== 20){
            popResource(level, pos, new ItemStack(Items.BEE_NEST,gift_count));

        }

    }

    private static int inclusiveBoundedRandom(Random random, int min, int max) {
        return min + random.nextInt(max-min);
    }
}
