package com.maideniles.maidensmerrymaking.render;

import com.maideniles.maidensmerrymaking.items.armor.RedChristmasArmorModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.IItemRenderProperties;

public class RedChristmasArmorRenderProperties implements IItemRenderProperties
{
    public static final RedChristmasArmorRenderProperties INSTANCE = new RedChristmasArmorRenderProperties();

    private RedChristmasArmorRenderProperties()
    {

    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends HumanoidModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, A _default)
    {
        return (A) RedChristmasArmorModel.INSTANCE;
    }
}