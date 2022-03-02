package com.maideniles.maidensmerrymaking.items.armor;

import com.maideniles.maidensmerrymaking.render.ReindeerEarsArmorRenderProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.IItemRenderProperties;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class ReindeerEarsArmorItem extends ArmorItem
{
    public final EquipmentSlot type;

    public ReindeerEarsArmorItem(ArmorMaterial mat, EquipmentSlot type, Properties props) {
        super(mat, type, props);
        this.type = type;
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer)
    {
        consumer.accept(ReindeerEarsArmorRenderProperties.INSTANCE);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        ResourceLocation registryName = getRegistryName();
        if (registryName == null)
        {
            return null;
        }
        return registryName.getNamespace() + ":textures/models/armor/" + registryName.getPath() + ".png";
    }
}