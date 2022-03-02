package com.maideniles.maidensmerrymaking.render;

import com.maideniles.maidensmerrymaking.items.armor.ReindeerEarsArmorModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.IItemRenderProperties;

public class ReindeerEarsArmorRenderProperties implements IItemRenderProperties
{
    public static final ReindeerEarsArmorRenderProperties INSTANCE = new ReindeerEarsArmorRenderProperties();

    private ReindeerEarsArmorRenderProperties()
    {

    }

    @SuppressWarnings("unchecked")
    @Override
    public <A extends HumanoidModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, A _default)
    {
        return (A) ReindeerEarsArmorModel.INSTANCE;
    }
}