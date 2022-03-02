package com.maideniles.maidensmerrymaking.event;


import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nonnull;
import java.util.List;


@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpruceLeavesConverterModifier extends LootModifier {
    private final int numSeedsToConvert;
    private final Item itemToCheck;
    private final Item itemReward;
    public SpruceLeavesConverterModifier(LootItemCondition[] conditions, int numSeeds, Item itemCheck, Item reward) {
        super(conditions);
        numSeedsToConvert = numSeeds;
        itemToCheck = itemCheck;
        itemReward = reward;
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
        //
        // Additional conditions can be checked, though as much as possible should be parameterized via JSON data.
        // It is better to write a new ILootCondition implementation than to do things here.
        //
        int numSeeds = 0;
        for (ItemStack stack : generatedLoot) {
            if (stack.getItem() == itemToCheck)
                numSeeds += stack.getCount();
        }
        if (numSeeds >= numSeedsToConvert) {
            generatedLoot.removeIf(x -> x.getItem() == itemToCheck);
            generatedLoot.add(new ItemStack(itemReward, (numSeeds / numSeedsToConvert)));
            numSeeds = numSeeds % numSeedsToConvert;
            if (numSeeds > 0)
                generatedLoot.add(new ItemStack(itemToCheck, numSeeds));
        }
        return generatedLoot;
    }

    @SubscribeEvent
    public static void registerModifiers(RegistryEvent.Register<GlobalLootModifierSerializer<?>> registryEvent) {
        registryEvent.getRegistry().register(new Serializer().setRegistryName(MaidensMerryMaking.MOD_ID, "tiny_spruce_drop"));
    }

    public static class Serializer extends GlobalLootModifierSerializer<SpruceLeavesConverterModifier> {

        @Override
        public SpruceLeavesConverterModifier read(ResourceLocation name, JsonObject object, LootItemCondition[] conditions) {
            int numSeeds = GsonHelper.getAsInt(object, "numSeeds");
            Item seed = ForgeRegistries.ITEMS.getValue(new ResourceLocation((GsonHelper.getAsString(object, "seedItem"))));
            Item tiny_spruce = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "replacement")));
            return new SpruceLeavesConverterModifier(conditions, numSeeds, seed, tiny_spruce);
        }

        @Override
        public JsonObject write(SpruceLeavesConverterModifier instance) {
            JsonObject json = makeConditions(instance.conditions);
            json.addProperty("numSeeds", instance.numSeedsToConvert);
            json.addProperty("seedItem", ForgeRegistries.ITEMS.getKey(instance.itemToCheck).toString());
            json.addProperty("replacement", ForgeRegistries.ITEMS.getKey(instance.itemReward).toString());
            return json;
        }
    }
}