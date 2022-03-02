package com.maideniles.maidensmerrymaking.blocks.fireplace.logs;


import com.maideniles.maidensmerrymaking.blocks.deco.HorizontalDecoBlock;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.MantelTopLeftStocking;
import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class FireplaceLogsOn extends HorizontalDecoBlock {
    protected static final VoxelShape WEST_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape EAST_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape NORTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);


    public static final BooleanProperty BURNING = BooleanProperty.create("burning");


    public FireplaceLogsOn(Properties properties) {
        super(properties.sound(SoundType.WOOD));
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(DIRECTION, context.getHorizontalDirection().getOpposite()).setValue(BURNING, Boolean.TRUE);

    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult pHit) {
        Random random = level.getRandom();
        Boolean burnt = Boolean.FALSE;

        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide()) {

            }

            if (stack.getItem() == Items.WATER_BUCKET) {

                System.out.println("FIREPLACE QUENCHED");
                stack.shrink(1);
                player.getInventory().add(new ItemStack(Items.BUCKET));
                level.setBlock(pos, ModBlocks.FIREPLACE_LOGS.get().defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(Fireplace.BURNED, Boolean.TRUE), 3);
                level.playSound((Player)null, pos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.addParticle(ParticleTypes.SMOKE, (double)pos.getX() + 0.5D + random.nextDouble() / 4.0D * (double)(random.nextBoolean() ? 1 : -1), (double)pos.getY() + 0.4D, (double)pos.getZ() + 0.5D + random.nextDouble() / 4.0D * (double)(random.nextBoolean() ? 1 : -1), 0.0D, 0.005D, 0.0D);
                return InteractionResult.PASS;
            }

            if(burnt == level.getBlockState(pos).getValue(FireplaceLogsOn.BURNING)) {

                if (stack.getItem() == Items.FLINT_AND_STEEL) {
                    System.out.println("LIT FIREPLACE AGAIN");
                    level.setBlock(pos, this.defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(BURNING, Boolean.TRUE), 3);


                }


        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }


    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {

        switch(state.getValue(DIRECTION)) {
            case SOUTH:
                return SOUTH_AABB;
            case NORTH:
            default:
                return NORTH_AABB;
            case WEST:
                return WEST_AABB;
            case EAST:
                return EAST_AABB;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(BURNING);

    }


}
