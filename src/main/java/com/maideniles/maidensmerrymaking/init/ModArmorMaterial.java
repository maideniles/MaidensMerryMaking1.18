package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;


import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    RED_WOOL("red_wool", 25, new int[] {3, 6, 8, 3}, 10, Item.byBlock(Blocks.RED_WOOL), "item.armor.equip_leather", 2.0f, 0.0f),
    GREEN_WOOL("green_wool", 25, new int[] {3, 6, 8, 3}, 10, Item.byBlock(Blocks.RED_WOOL), "item.armor.equip_leather", 2.0f, 0.0f),
    RED_SANTA_HAT("red_santa_hat", 25, new int[] {3, 6, 8, 3}, 10, Item.byBlock(Blocks.RED_WOOL), "item.armor.equip_leather", 2.0f, 0.0f),
    REINDEER_EARS("reindeerEars", 25, new int[] {3, 6, 8, 3}, 10, Item.byBlock(Blocks.RED_WOOL), "item.armor.equip_leather", 2.0f, 0.0f);


    private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
    private String name, equipSound;
    private int durability, enchantability;
    private Item repairItem;
    private int[] damageReductionAmounts;
    private float toughness;
    private float knockbackResistance;

    private ModArmorMaterial(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, String equipSound, float toughness, float knockbackResistance)
    {
        this.name = name;
        this.equipSound = equipSound;
        this.durability = durability;
        this.enchantability = enchantability;
        this.repairItem = repairItem;
        this.damageReductionAmounts = damageReductionAmounts;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public String getName()
    {
        return MaidensMerryMaking.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot)
    {
        return max_damage_array[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot)
    {
        return this.damageReductionAmounts[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return new SoundEvent(new ResourceLocation(equipSound));
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.of(this.repairItem);
    }
}