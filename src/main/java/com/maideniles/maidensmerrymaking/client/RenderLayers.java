package com.maideniles.maidensmerrymaking.client;


import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RenderLayers {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MKEKA_WITH_CORN_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MKEKA_WITH_CORN_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MKEKA_WITH_CORN_3.get(), RenderType.cutoutMipped());

        //LOGS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FIREPLACE_LOGS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FIREPLACE_LOGS_ON.get(), RenderType.cutoutMipped());
        //LAMP POSTS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAMP_POST_POLE_WREATH.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAMP_POST_POLE_WREATH_MULTI.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAMP_POST_POLE_WREATH_WHITE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAMP_POST_POLE_BOW.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_WREATH.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get(), RenderType.cutoutMipped());

        //CLASSIC LIGHTS//

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_DIAGONAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_DIAGONAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_CAP.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_RIGHT.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_CORNER_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_LIGHTS_VERTICAL_CORNER_RIGHT.get(), RenderType.cutoutMipped());


        //CLASSIC MULTI COLORED//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI_DIAGONAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI_DIAGONAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI_CAP.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_RIGHT.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_CORNER_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLASSIC_MULTI_VERTICAL_CORNER_RIGHT.get(), RenderType.cutoutMipped());

        //ICICLE LIGHTS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_LIGHTS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_LIGHTS_DIAGONAL_LEFT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_LIGHTS_DIAGONAL_RIGHT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_LIGHTS_CAP.get(),  RenderType.cutoutMipped());

        //ICICLE MULTI COLORED//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_MULTI.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_MULTI_DIAGONAL_LEFT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_MULTI_DIAGONAL_RIGHT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE_MULTI_CAP.get(),  RenderType.cutoutMipped());

        //TWINKLING_ICICLE LIGHTS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS_DIAGONAL_LEFT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS_DIAGONAL_RIGHT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_LIGHTS_CAP.get(),  RenderType.cutoutMipped());
        //TWINKLING_ICICLE MULTI COLORED//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI_DIAGONAL_LEFT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI_DIAGONAL_RIGHT.get(),  RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TWINKLING_ICICLE_MULTI_CAP.get(),  RenderType.cutoutMipped());


//MINI LIGHTS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_LIGHTS.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_LIGHTS_DIAGONAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_LIGHTS_DIAGONAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_LIGHTS_CAP.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_LIGHTS_VERTICAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_LIGHTS_VERTICAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_CORNER_LIGHTS_VERTICAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_CORNER_LIGHTS_VERTICAL_RIGHT.get(), RenderType.cutoutMipped());

        //MINI MULTI COLORED//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_MULTI.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_MULTI_DIAGONAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_MULTI_DIAGONAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_MULTI_CAP.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_MULTI_VERTICAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_MULTI_VERTICAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_CORNER_MULTI_VERTICAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MINI_CORNER_MULTI_VERTICAL_LEFT.get(), RenderType.cutoutMipped());
//GARLAND BLOCKS--DIAGONAL//

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_DIAGONAL_LEFT.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_DIAGONAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_LIGHTS_DIAGONAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_LIGHTS_DIAGONAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_MULTI_DIAGONAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_MULTI_DIAGONAL_RIGHT.get(), RenderType.cutoutMipped());


        //GARLAND BLOCKS--HORIZONTAL//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_HORIZONTAL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_WHITE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_HORIZONTAL_LIGHTS_MULTI.get(), RenderType.cutoutMipped());

        //GARLAND VERTICAL//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_MULTI_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_WHITE_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_MULTI_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LIGHTS_WHITE_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_LEFT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GARLAND_VERTICAL_CORNER_MULTI_RIGHT.get(), RenderType.cutoutMipped());


        //DOORS & FENCES//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.IRON_WREATH_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.IRON_WREATH_LIGHTS_WHITE_DOOR.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.IRON_WREATH_LIGHTS_MULTI_DOOR.get(), RenderType.cutoutMipped());


        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_PICKET_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_FENCE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_MULTI_FENCE.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_PICKET_FENCE_GATE.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_LIGHTS_FENCE_GATE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_WREATH_MULTI_FENCE_GATE.get(), RenderType.cutoutMipped());


//WALLS//
       ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLESTONE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLESTONE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLESTONE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOSSY_COBBLESTONE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOSSY_COBBLESTONE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOSSY_COBBLESTONE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BRICK_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BRICK_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PRISMARINE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PRISMARINE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PRISMARINE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_SANDSTONE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_SANDSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_SANDSTONE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRANITE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRANITE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRANITE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STONE_BRICK_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STONE_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STONE_BRICK_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHER_BRICK_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHER_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NETHER_BRICK_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_NETHER_BRICK_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_NETHER_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_NETHER_BRICK_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SANDSTONE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SANDSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SANDSTONE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_STONE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_STONE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.END_STONE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIORITE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIORITE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DIORITE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACKSTONE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACKSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACKSTONE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_BRICK_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_BLACKSTONE_BRICK_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLED_DEEPSLATE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLED_DEEPSLATE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.COBBLED_DEEPSLATE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_DEEPSLATE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_DEEPSLATE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POLISHED_DEEPSLATE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_BRICK_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_BRICK_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_BRICK_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_TILE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_TILE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DEEPSLATE_TILE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANDESITE_GARLAND_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANDESITE_GARLAND_LIGHTS_WALL.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANDESITE_GARLAND_MULTI_WALL.get(), RenderType.cutoutMipped());

        //MANTEL DECO//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANTEL_DECO.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANTEL_DECO_1.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANTEL_DECO_2.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANTEL_DECO_3.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANTEL_DECO_4.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANTEL_DECO_5.get(), RenderType.cutoutMipped());
//TREES//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_TOP.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_WHITE_LIGHTS_TOP.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_MULTI_LIGHTS_TOP.get(), RenderType.cutoutMipped());


//GEN TREE//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TREE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TREE_TOP.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_STAND.get(), RenderType.cutoutMipped());
//TOPPERS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BOW_TOPPER.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STAR_TOPPER.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_TREE_STAND.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CORN_STALK.get(), RenderType.cutoutMipped());
//HOLIDAY BLOCKS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.KINARA.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.KINARA_LIT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MKEKA_WITH_KINARA_LIT.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MKEKA_WITH_KINARA.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MKEKA_WITH_CHALICE.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHALICE.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MKEKA.get(),RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MENORAH.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MENORAH_LIT.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DREIDEL.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GELT.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TINY_SPRUCE.get(),RenderType.cutoutMipped());

       //WREATHS//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_WREATH.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_WHITE_LIGHTS.get(),RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHRISTMAS_WREATH_MULTI_LIGHTS.get(),RenderType.cutoutMipped());
//LIT LEAVES-BUSHES//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HOLLY_SAPLING.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_LEAVES_HOLLY.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_WHITE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_LARGE_WHITE.get(), RenderType.cutoutMipped());



        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_MULTI.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_LEAVES_LIGHTS_LARGE_MULTI.get(), RenderType.cutoutMipped());


        //DECORATED CHRISTMAS TREES//

        //COLORFUL//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_CHRISTMAS_TREE_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_CHRISTMAS_TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_CHRISTMAS_TREE_TOP.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_LIGHTS_CHRISTMAS_TREE_TOP.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_MULTI_CHRISTMAS_TREE_TOP.get(), RenderType.cutoutMipped());

        //TRADITIONAL//
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_TOP.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_CHRISTMAS_TREE_TOP.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_MIDDLE.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DECORATED_WHITE_MULTI_CHRISTMAS_TREE_TOP.get(), RenderType.cutoutMipped());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PRESENT.get(), RenderType.cutoutMipped());


























    }

    public static void safeRunClient() {
        final IEventBus eventHandler = FMLJavaModLoadingContext.get().getModEventBus();
        eventHandler.register(RenderLayers.class);
    }
}