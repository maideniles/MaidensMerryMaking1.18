package com.maideniles.maidensmerrymaking.items;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.List;


public class MintBottleItem extends Item {
    public MintBottleItem(Properties p_40648_) {
        super(p_40648_);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        List<AreaEffectCloud> list = level.getEntitiesOfClass(AreaEffectCloud.class, player.getBoundingBox().inflate(2.0D), (p_40650_) -> {
            return p_40650_ != null && p_40650_.isAlive() && p_40650_.getOwner() instanceof EnderDragon;
        });
        ItemStack itemstack = player.getItemInHand(hand);
        if (!list.isEmpty()) {
            AreaEffectCloud areaeffectcloud = list.get(0);
            areaeffectcloud.setRadius(areaeffectcloud.getRadius() - 0.5F);
            level.playSound((Player) null, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL_DRAGONBREATH, SoundSource.NEUTRAL, 1.0F, 1.0F);
            level.gameEvent(player, GameEvent.FLUID_PICKUP, player.blockPosition());
            return InteractionResultHolder.sidedSuccess(this.turnBottleIntoItem(itemstack, player, new ItemStack(Items.DRAGON_BREATH)), level.isClientSide());
        } else {
            HitResult hitresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
            if (hitresult.getType() == HitResult.Type.MISS) {
                return InteractionResultHolder.pass(itemstack);
            } else {
                if (hitresult.getType() == HitResult.Type.BLOCK) {
                    BlockPos blockpos = ((BlockHitResult) hitresult).getBlockPos();
                    if (!level.mayInteract(player, blockpos)) {
                        return InteractionResultHolder.pass(itemstack);
                    }

                    if (level.getFluidState(blockpos).is(FluidTags.WATER)) {
                        level.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);
                        level.gameEvent(player, GameEvent.FLUID_PICKUP, blockpos);
                        return InteractionResultHolder.sidedSuccess(this.turnBottleIntoItem(itemstack, player, (new ItemStack(ModItems.PEPPERMINT_EXTRACT.get()))), level.isClientSide());
                    }
                }

                return InteractionResultHolder.pass(itemstack);
            }
        }
    }

    protected ItemStack turnBottleIntoItem(ItemStack stack, Player player, ItemStack p_40654_) {
        stack.shrink(1);
        player.awardStat(Stats.ITEM_USED.get(this));
        if (p_40654_.isEmpty()) {
            return stack;
        } else {
            if (!player.getInventory().add(stack)) {
                player.drop(stack, false);
            }

            return ItemUtils.createFilledResult(stack, player, p_40654_);


        }
    }

}