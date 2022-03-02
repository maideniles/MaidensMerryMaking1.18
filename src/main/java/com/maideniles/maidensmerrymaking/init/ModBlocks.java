package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.blocks.*;
import com.maideniles.maidensmerrymaking.blocks.crop.*;
import com.maideniles.maidensmerrymaking.blocks.deco.*;
import com.maideniles.maidensmerrymaking.blocks.deco.lights.*;
import com.maideniles.maidensmerrymaking.blocks.fireplace.logs.Fireplace;
import com.maideniles.maidensmerrymaking.blocks.fireplace.logs.FireplaceLogsOn;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.base.*;
import com.maideniles.maidensmerrymaking.blocks.fireplace.mantel.woods.*;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPost;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPostBottom;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPostOn;
import com.maideniles.maidensmerrymaking.blocks.lamppost.LampPostPole;
import com.maideniles.maidensmerrymaking.blocks.tree.*;
import com.maideniles.maidensmerrymaking.blocks.tree.decorated.DecoratedTreeBottomBlock;
import com.maideniles.maidensmerrymaking.blocks.tree.decorated.DecoratedTreeMiddleBlock;
import com.maideniles.maidensmerrymaking.blocks.tree.decorated.DecoratedTreeTopBlock;
import com.maideniles.maidensmerrymaking.blocks.tree.lights.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MaidensMerryMaking.MOD_ID);




    public static final RegistryObject<Block> MINT_PLANT = BLOCKS.register("mint_plant",
            () -> new MintPlant(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> CORN_STALK = BLOCKS.register("corn_stalk",
            () -> new CornStalkBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> GINGER_PLANT = BLOCKS.register("ginger_plant",
            () -> new GingerPlant(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> SWEET_POTATO_PLANT = BLOCKS.register("sweet_potato_plant",
            () -> new SweetPotatoPlant(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block>   TINY_SPRUCE = registerBlock("tiny_spruce",
            () -> new GrowableTinySpruce(Block.Properties.of(Material.PLANT).strength(0.5F).noOcclusion().sound(SoundType.CROP)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   HOLLY_SAPLING = registerBlock("holly_sapling",
            () -> new GrowableHollyTree(Block.Properties.of(Material.PLANT).strength(0.5F).noOcclusion().sound(SoundType.CROP)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);



    public static final RegistryObject<Block> CHRISTMAS_WREATH = registerBlock("christmas_wreath",
            () -> new WreathBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F).sound(SoundType.MOSS_CARPET).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHRISTMAS_WREATH_WHITE_LIGHTS = registerBlock("christmas_wreath_white_lights",
            () -> new WreathBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F).sound(SoundType.MOSS_CARPET).noOcclusion().lightLevel((p_50828_) -> {
                return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHRISTMAS_WREATH_MULTI_LIGHTS = registerBlock("christmas_wreath_multi_lights",
            () -> new WreathBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F).sound(SoundType.MOSS_CARPET).noOcclusion().lightLevel((p_50828_) -> {
                return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TOPPERS//
    public static final RegistryObject<Block> STAR_TOPPER = registerBlock("star_topper",
            () -> new TopperBlock(Block.Properties.of(Material.METAL).strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 10; }).sound(SoundType.LARGE_AMETHYST_BUD).noOcclusion()), null);

    public static final RegistryObject<Block> BOW_TOPPER = registerBlock("bow_topper",
            () -> new TopperBlock(Block.Properties.of(Material.CLOTH_DECORATION).strength(0.5F, 2.0F).sound(SoundType.WOOL).noOcclusion()), null);



    //blocks that make up the christmas pine feature//
    public static final RegistryObject<Block>   TREE = registerBlock("christmas_pine_bottom",
            () -> new SpruceBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   TREE_MIDDLE = registerBlock("christmas_pine_middle",
            () -> new SpruceMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   TREE_TOP = registerBlock("christmas_pine_top",
            () -> new SpruceTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).sound(SoundType.CROP)) , null);

    //HARVEST TRAY//
    public static final RegistryObject<Block> HARVEST_TRAY = registerBlock("harvest_tray",
           ()-> new TrayBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.0F).noOcclusion()),ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //COOKIE TRAY//

       public static final RegistryObject<Block> COOKIE_TRAY = registerBlock("cookie_tray",
            ()-> new TrayBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.0F).noOcclusion()),ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //KINARA//
        public static final RegistryObject<Block> KINARA = registerBlock("kinara",
            ()-> new KinaraBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion()),ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> KINARA_LIT = registerBlock("kinara_lit",
            ()-> new KinaraBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; })),ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALICE = registerBlock("chalice",
            ()-> new ChaliceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion()),ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //MKEKA BLOCKS//

    public static final RegistryObject<Block> MKEKA = registerBlock("mkeka",
            ()-> new MkekaBlock(BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.2F, 2.0F).noOcclusion().sound(SoundType.WOOL)),ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MKEKA_WITH_KINARA = registerBlock("mkeka_with_kinara",
            ()-> new MkekaWithKinaraBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion()),null);

    public static final RegistryObject<Block> MKEKA_WITH_KINARA_LIT = registerBlock("mkeka_with_kinara_lit",
            ()-> new MkekaWithKinaraBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; })),null);

    public static final RegistryObject<Block> MKEKA_WITH_CHALICE = registerBlock("mkeka_with_chalice",
            ()-> new MkekaWithChaliceBlock(BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).noOcclusion().sound(SoundType.WOOL).strength(1.5F)),null);

    public static final RegistryObject<Block> MKEKA_WITH_CORN_1 = registerBlock("mkeka_corn_1",
            ()-> new MkekaBlock(BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.2F, 2.0F).noOcclusion().sound(SoundType.WOOL)),null);

    public static final RegistryObject<Block> MKEKA_WITH_CORN_2 = registerBlock("mkeka_corn_2",
            ()-> new MkekaBlock(BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.2F, 2.0F).noOcclusion().sound(SoundType.WOOL)),null);

    public static final RegistryObject<Block> MKEKA_WITH_CORN_3 = registerBlock("mkeka_corn_3",
            ()-> new MkekaBlock(BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.2F, 2.0F).noOcclusion().sound(SoundType.WOOL)),null);



    //MENORAH BLOCKS//

    public static final RegistryObject<Block> MENORAH = registerBlock("menorah",
            ()-> new MenorahBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion()),ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MENORAH_LIT = registerBlock("menorah_lit",
            ()-> new MenorahBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; })),ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DREIDEL//
    public static final RegistryObject<Block> DREIDEL = registerBlock("dreidel",
            ()-> new DreidelBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(0.5F, 2.0F).noOcclusion()),ModItemGroups.MAIDENS_BLOCKS_GROUP);
//GELT//
public static final RegistryObject<Block> GELT = registerBlock("gelt",
        ()-> new GeltBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()),ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //CHRISTMAS TREE//

    public static final RegistryObject<Block>   CHRISTMAS_TREE_STAND = registerBlock("christmas_tree_stand",
            () -> new TreeStandBlock(Block.Properties.of(Material.STONE).strength(0.5F, 2.0F).noOcclusion()) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

//PLAIN TREE//
    public static final RegistryObject<Block>   CHRISTMAS_TREE_BOTTOM = registerBlock("christmas_tree_bottom",
            () -> new ChristmasTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   CHRISTMAS_TREE_MIDDLE = registerBlock("christmas_tree_middle",
            () -> new ChristmasTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   CHRISTMAS_TREE_TOP = registerBlock("christmas_tree_top",
            () -> new ChristmasTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   MUG = registerBlock("mug",
            () -> new MugBlock(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F).noOcclusion().sound(SoundType.TUFF)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    // WHITE LIGHTS//
    public static final RegistryObject<Block>   CHRISTMAS_TREE_WHITE_LIGHTS_BOTTOM = registerBlock("christmas_tree_white_lights_bottom",
            () -> new LightsChristmasTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   CHRISTMAS_TREE_WHITE_LIGHTS_MIDDLE = registerBlock("christmas_tree_white_lights_middle",
            () -> new LightsChristmasTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   CHRISTMAS_TREE_WHITE_LIGHTS_TOP = registerBlock("christmas_tree_white_lights_top",
            () -> new LightsChristmasTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    // MULTI LIGHTS//
    public static final RegistryObject<Block>   CHRISTMAS_TREE_MULTI_LIGHTS_BOTTOM = registerBlock("christmas_tree_multi_lights_bottom",
            () -> new MultiChristmasTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   CHRISTMAS_TREE_MULTI_LIGHTS_MIDDLE = registerBlock("christmas_tree_multi_lights_middle",
            () -> new MultiChristmasTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   CHRISTMAS_TREE_MULTI_LIGHTS_TOP = registerBlock("christmas_tree_multi_lights_top",
            () -> new MultiChristmasTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);



    //DECORATED WITH ORNAMENTS, NO LIGHTS/
    public static final RegistryObject<Block>   DECORATED_CHRISTMAS_TREE_BOTTOM = registerBlock("decorated_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_CHRISTMAS_TREE_MIDDLE = registerBlock("decorated_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_CHRISTMAS_TREE_TOP = registerBlock("decorated_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    //DECORATED WITH WHITE ORNAMENTS, NO LIGHTS/
    public static final RegistryObject<Block>   DECORATED_WHITE_CHRISTMAS_TREE_BOTTOM = registerBlock("decorated_white_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_WHITE_CHRISTMAS_TREE_MIDDLE = registerBlock("decorated_white_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_WHITE_CHRISTMAS_TREE_TOP = registerBlock("decorated_white_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().sound(SoundType.CROP)) , null);




    //WHITE LIGHTS AND WHITE ORNAMENTS//
    public static final RegistryObject<Block>   DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_BOTTOM = registerBlock("decorated_white_lights_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_MIDDLE = registerBlock("decorated_white_lights_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_WHITE_LIGHTS_CHRISTMAS_TREE_TOP = registerBlock("decorated_white_lights_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);


    //WHITE LIGHTS AND COLORED ORNAMENTS//
    public static final RegistryObject<Block>   DECORATED_LIGHTS_CHRISTMAS_TREE_BOTTOM = registerBlock("decorated_lights_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_LIGHTS_CHRISTMAS_TREE_MIDDLE = registerBlock("decorated_lights_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_LIGHTS_CHRISTMAS_TREE_TOP = registerBlock("decorated_lights_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    //MULTI LIGHTS AND WHITE ORNAMENTS//
    public static final RegistryObject<Block>   DECORATED_WHITE_MULTI_CHRISTMAS_TREE_BOTTOM = registerBlock("decorated_white_multi_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_WHITE_MULTI_CHRISTMAS_TREE_MIDDLE = registerBlock("decorated_white_multi_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_WHITE_MULTI_CHRISTMAS_TREE_TOP = registerBlock("decorated_white_multi_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);


    //MULTI LIGHTS AND COLORED ORNAMENTS//
    public static final RegistryObject<Block>   DECORATED_MULTI_CHRISTMAS_TREE_BOTTOM = registerBlock("decorated_multi_christmas_tree_bottom",
            () -> new DecoratedTreeBottomBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_MULTI_CHRISTMAS_TREE_MIDDLE = registerBlock("decorated_multi_christmas_tree_middle",
            () -> new DecoratedTreeMiddleBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    public static final RegistryObject<Block>   DECORATED_MULTI_CHRISTMAS_TREE_TOP = registerBlock("decorated_multi_christmas_tree_top",
            () -> new DecoratedTreeTopBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().lightLevel((p_50828_) -> { return 10; }).sound(SoundType.CROP)) , null);

    //PRESENT//
    public static final RegistryObject<Block> PRESENT = registerBlock("present",
            () -> new PresentBlock(Block.Properties.of(Material.DECORATION).strength(0.2F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);





    public static final RegistryObject<Block> MANTEL_DECO = registerBlock("mantel_deco",
            () -> new MantelDecoBlock(Block.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_1 = registerBlock("mantel_deco_1",
            () -> new MantelDecoBlock(Block.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_2 = registerBlock("mantel_deco_2",
            () -> new MantelDecoBlock(Block.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_3 = registerBlock("mantel_deco_3",
            () -> new MantelDecoBlock(Block.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_4 = registerBlock("mantel_deco_4",
            () -> new MantelDecoBlock(Block.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DECO_5 = registerBlock("mantel_deco_5",
            () -> new MantelDecoBlock(Block.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //ACACIA MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_ACACIA_NORMAL = registerBlock("mantel_normal_acacia",
            () -> new MantelBlockAcacia(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_ACACIA_TOP_MIDDLE = BLOCKS.register("mantel_acacia_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_ACACIA_TOP_LEFT_STOCKING = BLOCKS.register("mantel_acacia_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_ACACIA_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_acacia_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_ACACIA_LEG_LEFT = BLOCKS.register("mantel_acacia_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_ACACIA_LEG_RIGHT = BLOCKS.register("mantel_acacia_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    //BIRCH MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_BIRCH_NORMAL = registerBlock("mantel_normal_birch",
            () -> new MantelBlockBirch(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_BIRCH_TOP_MIDDLE = BLOCKS.register("mantel_birch_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_BIRCH_TOP_LEFT_STOCKING = BLOCKS.register("mantel_birch_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_BIRCH_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_birch_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_BIRCH_LEG_LEFT = BLOCKS.register("mantel_birch_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_BIRCH_LEG_RIGHT = BLOCKS.register("mantel_birch_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    //OAK MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_OAK_NORMAL = registerBlock("mantel_normal_oak",
            () -> new MantelBlockOak(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_OAK_TOP_MIDDLE = BLOCKS.register("mantel_oak_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_OAK_TOP_LEFT_STOCKING = BLOCKS.register("mantel_oak_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_OAK_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_oak_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_OAK_LEG_LEFT = BLOCKS.register("mantel_oak_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_OAK_LEG_RIGHT = BLOCKS.register("mantel_oak_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    //DARK_OAK MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_DARK_OAK_NORMAL = registerBlock("mantel_normal_dark_oak",
            () -> new MantelBlockDarkOak(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_DARK_OAK_TOP_MIDDLE = BLOCKS.register("mantel_dark_oak_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_TOP_LEFT_STOCKING = BLOCKS.register("mantel_dark_oak_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_dark_oak_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_LEG_LEFT = BLOCKS.register("mantel_dark_oak_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_DARK_OAK_LEG_RIGHT = BLOCKS.register("mantel_dark_oak_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    //SPRUCE MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_SPRUCE_NORMAL = registerBlock("mantel_normal_spruce",
            () -> new MantelBlockSpruce(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_SPRUCE_TOP_MIDDLE = BLOCKS.register("mantel_spruce_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_SPRUCE_TOP_LEFT_STOCKING = BLOCKS.register("mantel_spruce_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_SPRUCE_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_spruce_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_SPRUCE_LEG_LEFT = BLOCKS.register("mantel_spruce_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_SPRUCE_LEG_RIGHT = BLOCKS.register("mantel_spruce_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    //JUNGLE MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_JUNGLE_NORMAL = registerBlock("mantel_normal_jungle",
            () -> new MantelBlockJungle(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_JUNGLE_TOP_MIDDLE = BLOCKS.register("mantel_jungle_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_JUNGLE_TOP_LEFT_STOCKING = BLOCKS.register("mantel_jungle_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_JUNGLE_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_jungle_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_JUNGLE_LEG_LEFT = BLOCKS.register("mantel_jungle_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_JUNGLE_LEG_RIGHT = BLOCKS.register("mantel_jungle_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    //CRIMSON MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_CRIMSON_NORMAL = registerBlock("mantel_normal_crimson",
            () -> new MantelBlockCrimson(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_CRIMSON_TOP_MIDDLE = BLOCKS.register("mantel_crimson_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_CRIMSON_TOP_LEFT_STOCKING = BLOCKS.register("mantel_crimson_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_CRIMSON_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_crimson_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_CRIMSON_LEG_LEFT = BLOCKS.register("mantel_crimson_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_CRIMSON_LEG_RIGHT = BLOCKS.register("mantel_crimson_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    //WARPED MANTEL BLOCKS//
    public static final RegistryObject<Block> MANTEL_WARPED_NORMAL = registerBlock("mantel_normal_warped",
            () -> new MantelBlockWarped(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MANTEL_WARPED_TOP_MIDDLE = BLOCKS.register("mantel_warped_top_middle_stocking",
            () -> new MantelTopCenterStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_WARPED_TOP_LEFT_STOCKING = BLOCKS.register("mantel_warped_top_left_stocking",
            () -> new MantelTopLeftStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_WARPED_TOP_RIGHT_STOCKING = BLOCKS.register("mantel_warped_top_right_stocking",
            () -> new MantelTopRightStocking(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_WARPED_LEG_LEFT = BLOCKS.register("mantel_warped_leg_left",
            () -> new MantelLegLeft(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MANTEL_WARPED_LEG_RIGHT = BLOCKS.register("mantel_warped_leg_right",
            () -> new MantelLegRight(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.0F).requiresCorrectToolForDrops()));


    //FIREPLACE LOGS//
    public static final RegistryObject<Block>  FIREPLACE_LOGS = registerBlock("fireplace_logs",
            () -> new Fireplace(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> FIREPLACE_LOGS_ON = registerBlock("fireplace_logs_on",
            () -> new FireplaceLogsOn(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })),null);


    //LAMP POSTS//

    public static final RegistryObject<Block>  LAMP_POST = registerBlock("lamp_post",
            () -> new LampPost(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LAMP_POST_ON = BLOCKS.register("lamp_post_on",
            () -> new LampPostOn(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> {
                return 12; })));

    public static final RegistryObject<Block>  LAMP_POST_BOTTOM = registerBlock("lamp_post_bottom",
            () -> new LampPostBottom(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), null);

    public static final RegistryObject<Block>  LAMP_POST_POLE = registerBlock("lamp_post_pole",
            () -> new LampPostPole(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), null);

    //LAMP POST WITH DECORATIONS//
    public static final RegistryObject<Block>  LAMP_POST_POLE_WREATH = registerBlock("lamp_post_pole_wreath",
            () -> new LampPostPole(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), null);

    public static final RegistryObject<Block>  LAMP_POST_POLE_WREATH_WHITE = registerBlock("lamp_post_pole_wreath_white",
            () -> new LampPostPole(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> {
                return 12; })), null);

    public static final RegistryObject<Block>  LAMP_POST_POLE_WREATH_MULTI = registerBlock("lamp_post_pole_wreath_multi",
            () -> new LampPostPole(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> {
                return 12; })), null);

    public static final RegistryObject<Block>  LAMP_POST_POLE_BOW = registerBlock("lamp_post_pole_bow",
            () -> new LampPostPole(BlockBehaviour.Properties.of(Material.METAL).strength(0.5F, 2.0F).noOcclusion()), null);

//LIGHTS//
//CLASSIC LIGHTS//

    public static final RegistryObject<Block>   CLASSIC_LIGHTS = registerBlock("classic_lights_horizontal",
            () -> new ConnectingClassicWhite(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_LIGHTS_DIAGONAL_LEFT = registerBlock("classic_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_LIGHTS_DIAGONAL_RIGHT = registerBlock("classic_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_LIGHTS_CAP = registerBlock("classic_lights_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_LIGHTS_VERTICAL_LEFT = registerBlock("classic_lights_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_LIGHTS_VERTICAL_RIGHT = registerBlock("classic_lights_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_LIGHTS_VERTICAL_CORNER_LEFT = registerBlock("classic_lights_vertical_corner_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_LIGHTS_VERTICAL_CORNER_RIGHT = registerBlock("classic_lights_vertical_corner_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //CLASSIC MULTI COLORED//
    public static final RegistryObject<Block>   CLASSIC_MULTI = registerBlock("classic_multi_horizontal",
            () -> new ConnectingClassicMulti(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_MULTI_DIAGONAL_LEFT = registerBlock("classic_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_MULTI_DIAGONAL_RIGHT = registerBlock("classic_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_MULTI_CAP = registerBlock("classic_multi_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_MULTI_VERTICAL_LEFT = registerBlock("classic_multi_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_MULTI_VERTICAL_RIGHT = registerBlock("classic_multi_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_MULTI_VERTICAL_CORNER_LEFT = registerBlock("classic_multi_vertical_corner_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   CLASSIC_MULTI_VERTICAL_CORNER_RIGHT = registerBlock("classic_multi_vertical_corner_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //ICICLE LIGHTS//
    public static final RegistryObject<Block>   ICICLE_LIGHTS = registerBlock("icicle_lights_horizontal",
            () -> new ConnectingIcicleWhite(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   ICICLE_LIGHTS_DIAGONAL_LEFT = registerBlock("icicle_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   ICICLE_LIGHTS_DIAGONAL_RIGHT = registerBlock("icicle_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   ICICLE_LIGHTS_CAP = registerBlock("icicle_lights_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //ICICLE MULTI COLORED//
    public static final RegistryObject<Block>   ICICLE_MULTI = registerBlock("icicle_multi_horizontal",
            () -> new ConnectingIcicleMulti(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   ICICLE_MULTI_DIAGONAL_LEFT = registerBlock("icicle_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   ICICLE_MULTI_DIAGONAL_RIGHT = registerBlock("icicle_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   ICICLE_MULTI_CAP = registerBlock("icicle_multi_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TWINKLING_ICICLE LIGHTS//
    public static final RegistryObject<Block>   TWINKLING_ICICLE_LIGHTS = registerBlock("twinkling_icicle_lights_horizontal",
            () -> new ConnectingTwinklingIcicleWhite(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   TWINKLING_ICICLE_LIGHTS_DIAGONAL_LEFT = registerBlock("twinkling_icicle_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   TWINKLING_ICICLE_LIGHTS_DIAGONAL_RIGHT = registerBlock("twinkling_icicle_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   TWINKLING_ICICLE_LIGHTS_CAP = registerBlock("twinkling_icicle_lights_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TWINKLING_ICICLE MULTI COLORED//
    public static final RegistryObject<Block>   TWINKLING_ICICLE_MULTI = registerBlock("twinkling_icicle_multi_horizontal",
            () -> new ConnectingTwinklingIcicleMulti(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   TWINKLING_ICICLE_MULTI_DIAGONAL_LEFT = registerBlock("twinkling_icicle_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   TWINKLING_ICICLE_MULTI_DIAGONAL_RIGHT = registerBlock("twinkling_icicle_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   TWINKLING_ICICLE_MULTI_CAP = registerBlock("twinkling_icicle_multi_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //MINI LIGHTS//
    public static final RegistryObject<Block>   MINI_LIGHTS = registerBlock("mini_lights_horizontal",
            () -> new ConnectingMiniWhite(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_LIGHTS_DIAGONAL_LEFT = registerBlock("mini_lights_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_LIGHTS_DIAGONAL_RIGHT = registerBlock("mini_lights_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_LIGHTS_CAP = registerBlock("mini_lights_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);
//MINI VERTICAL//
    public static final RegistryObject<Block>   MINI_LIGHTS_VERTICAL_RIGHT = registerBlock("mini_lights_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_LIGHTS_VERTICAL_LEFT = registerBlock("mini_lights_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_MULTI_VERTICAL_RIGHT = registerBlock("mini_multi_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_MULTI_VERTICAL_LEFT = registerBlock("mini_multi_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);
//MINI CORNER VERTICAL//
    public static final RegistryObject<Block>   MINI_CORNER_LIGHTS_VERTICAL_RIGHT = registerBlock("mini_corner_lights_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_CORNER_LIGHTS_VERTICAL_LEFT = registerBlock("mini_corner_lights_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_CORNER_MULTI_VERTICAL_RIGHT = registerBlock("mini_corner_multi_vertical_right",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_CORNER_MULTI_VERTICAL_LEFT = registerBlock("mini_corner_multi_vertical_left",
            () -> new LightsVerticalBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //MINI MULTI COLORED//
    public static final RegistryObject<Block>   MINI_MULTI = registerBlock("mini_multi_horizontal",
            () -> new ConnectingMiniMulti(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_MULTI_DIAGONAL_LEFT = registerBlock("mini_multi_diagonal_left",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_MULTI_DIAGONAL_RIGHT = registerBlock("mini_multi_diagonal_right",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   MINI_MULTI_CAP = registerBlock("mini_multi_cap",
            () -> new LightsBlock(Block.Properties.of(Material.GLASS).strength(0.5F, 2.0F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

//GARLAND BLOCKS--DIAGONAL//

    public static final RegistryObject<Block>   GARLAND_DIAGONAL_LEFT = registerBlock("garland_diagonal_left",
            () -> new GarlandBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_DIAGONAL_RIGHT = registerBlock("garland_diagonal_right",
            () -> new GarlandBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_LIGHTS_DIAGONAL_LEFT = registerBlock("garland_lights_diagonal_left",
            () -> new GarlandBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_LIGHTS_DIAGONAL_RIGHT = registerBlock("garland_lights_diagonal_right",
            () -> new GarlandBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_MULTI_DIAGONAL_LEFT = registerBlock("garland_multi_diagonal_left",
            () -> new GarlandBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_MULTI_DIAGONAL_RIGHT = registerBlock("garland_multi_diagonal_right",
            () -> new GarlandBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GARLAND BLOCKS--HORIZONTAL//
    public static final RegistryObject<Block>   GARLAND_HORIZONTAL = registerBlock("garland_horizontal",
            () -> new ConnectingGarland(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_HORIZONTAL_LIGHTS_WHITE = registerBlock("garland_horizontal_lights",
            () -> new ConnectingGarlandWhite(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_HORIZONTAL_LIGHTS_MULTI = registerBlock("garland_horizontal_multi",
            () -> new ConnectingGarlandMulti(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GARLAND-VERTICAL//

    public static final RegistryObject<Block>   GARLAND_VERTICAL_LEFT = registerBlock("garland_vertical_left",
            () -> new GarlandVerticalBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_VERTICAL_RIGHT = registerBlock("garland_vertical_right",
            () -> new GarlandVerticalRight(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>   GARLAND_VERTICAL_LIGHTS_WHITE_LEFT = registerBlock("garland_vertical_lights_left",
            () -> new GarlandVerticalBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_VERTICAL_LIGHTS_WHITE_RIGHT = registerBlock("garland_vertical_lights_right",
            () -> new GarlandVerticalRight(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_VERTICAL_LIGHTS_MULTI_LEFT = registerBlock("garland_vertical_multi_left",
            () -> new GarlandVerticalBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_VERTICAL_LIGHTS_MULTI_RIGHT = registerBlock("garland_vertical_multi_right",
            () -> new GarlandVerticalRight(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GARLAND VERTICAL CORNERS//
    public static final RegistryObject<Block>   GARLAND_VERTICAL_CORNER_LEFT = registerBlock("garland_vertical_corner_left",
            () -> new GarlandVerticalCornerBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_VERTICAL_CORNER_RIGHT = registerBlock("garland_vertical_corner_right",
            () -> new GarlandVerticalCornerRightBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>   GARLAND_VERTICAL_CORNER_LIGHTS_LEFT = registerBlock("garland_vertical_corner_lights_left",
            () -> new GarlandVerticalCornerBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_VERTICAL_CORNER_LIGHTS_RIGHT = registerBlock("garland_vertical_corner_lights_right",
            () -> new GarlandVerticalCornerRightBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>   GARLAND_VERTICAL_CORNER_MULTI_LEFT = registerBlock("garland_vertical_corner_multi_left",
            () -> new GarlandVerticalCornerBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   GARLAND_VERTICAL_CORNER_MULTI_RIGHT = registerBlock("garland_vertical_corner_multi_right",
            () -> new GarlandVerticalCornerRightBlock(Block.Properties.of(Material.PLANT).strength(0.5F, 2.0F)
                    .noOcclusion().sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //ROOF STAIRS//
    public static final RegistryObject<Block> ROOF_ACACIA_STAIRS = registerBlock( "roof_acacia_stairs",
            () -> new SnowyStairsBlock( Blocks.ACACIA_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_BIRCH_STAIRS = registerBlock( "roof_birch_stairs",
            () -> new SnowyStairsBlock( Blocks.BIRCH_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_DARK_OAK_STAIRS = registerBlock( "roof_dark_oak_stairs",
            () -> new SnowyStairsBlock( Blocks.DARK_OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_JUNGLE_STAIRS = registerBlock( "roof_jungle_stairs",
            () -> new SnowyStairsBlock( Blocks.JUNGLE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_OAK_STAIRS= registerBlock( "roof_oak_stairs",
            () -> new SnowyStairsBlock( Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_SPRUCE_STAIRS = registerBlock( "roof_spruce_stairs",
            () -> new SnowyStairsBlock( Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_WARPED_STAIRS = registerBlock( "roof_warped_stairs",
            () -> new SnowyStairsBlock( Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_CRIMSON_STAIRS = registerBlock( "roof_crimson_stairs",
            () -> new SnowyStairsBlock( Blocks.SPRUCE_PLANKS.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
//ROOF TILES OTHER STAIRS//
public static final RegistryObject<Block> ROOF_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock( "roof_polished_blackstone_brick_stairs",
        () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_DEEPSLATE_BRICK_STAIRS = registerBlock( "roof_deepslate_brick_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROOF_STONE_BRICK_STAIRS = registerBlock( "roof_stone_brick_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);






    //TESTING SNOW ON STAIRS//
    public static final RegistryObject<Block> SNOWY_ACACIA_STAIRS = registerBlock( "snowy_acacia_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_BIRCH_STAIRS = registerBlock( "snowy_birch_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_DARK_OAK_STAIRS = registerBlock( "snowy_dark_oak_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_JUNGLE_STAIRS = registerBlock( "snowy_jungle_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_OAK_STAIRS= registerBlock( "snowy_oak_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_SPRUCE_STAIRS = registerBlock( "snowy_spruce_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_WARPED_STAIRS = registerBlock( "snowy_warped_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_CRIMSON_STAIRS = registerBlock( "snowy_crimson_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

//SNOWY OTHER STAIRS//
    public static final RegistryObject<Block> SNOWY_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock( "snowy_polished_blackstone_brick_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_DEEPSLATE_BRICK_STAIRS = registerBlock( "snowy_deepslate_brick_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SNOWY_STONE_BRICK_STAIRS = registerBlock( "snowy_stone_brick_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_QUARTZ.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_ROOF_SLAB = registerBlock("acacia_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> BIRCH_ROOF_SLAB = registerBlock("birch_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> OAK_ROOF_SLAB = registerBlock("oak_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> DARK_OAK_ROOF_SLAB = registerBlock("dark_oak_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> SPRUCE_ROOF_SLAB = registerBlock("spruce_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> JUNGLE_ROOF_SLAB = registerBlock("jungle_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> CRIMSON_ROOF_SLAB = registerBlock("crimson_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> WARPED_ROOF_SLAB = registerBlock("warped_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_ROOF_SLAB = registerBlock("polished_blackstone_brick_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_ROOF_SLAB = registerBlock("deepslate_brick_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> STONE_BRICK_ROOF_SLAB = registerBlock("stone_brick_roof_slab",
            () -> new SnowySlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));


    public static final RegistryObject<Block> ACACIA_SNOWY_SLAB = registerBlock("acacia_snowy_slab",
           () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> BIRCH_SNOWY_SLAB = registerBlock("birch_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> OAK_SNOWY_SLAB = registerBlock("oak_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> DARK_OAK_SNOWY_SLAB = registerBlock("dark_oak_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> SPRUCE_SNOWY_SLAB = registerBlock("spruce_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> JUNGLE_SNOWY_SLAB = registerBlock("jungle_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> CRIMSON_SNOWY_SLAB = registerBlock("crimson_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> WARPED_SNOWY_SLAB = registerBlock("warped_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_SNOWY_SLAB = registerBlock("polished_blackstone_brick_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_SNOWY_SLAB = registerBlock("deepslate_brick_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));
    public static final RegistryObject<Block> STONE_BRICK_SNOWY_SLAB = registerBlock("stone_brick_snowy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));





    //WREATH DOORS//
    public static final RegistryObject<Block> ACACIA_WREATH_DOOR = registerBlock("acacia_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> BIRCH_WREATH_DOOR = registerBlock("birch_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> OAK_WREATH_DOOR = registerBlock("oak_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> SPRUCE_WREATH_DOOR = registerBlock("spruce_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> DARK_OAK_WREATH_DOOR = registerBlock("dark_oak_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> JUNGLE_WREATH_DOOR = registerBlock("jungle_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> CRIMSON_WREATH_DOOR = registerBlock("crimson_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> WARPED_WREATH_DOOR = registerBlock("warped_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));

    public static final RegistryObject<Block> IRON_WREATH_DOOR = registerBlock("iron_wreath_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)));



    //WREATH LIGHTS DOORS//

    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_WHITE_DOOR = registerBlock("acacia_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_WHITE_DOOR = registerBlock("birch_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_WHITE_DOOR = registerBlock("oak_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_WHITE_DOOR = registerBlock("spruce_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_WHITE_DOOR = registerBlock("dark_oak_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_WHITE_DOOR = registerBlock("jungle_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_WHITE_DOOR = registerBlock("crimson_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_WHITE_DOOR = registerBlock("warped_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> IRON_WREATH_LIGHTS_WHITE_DOOR = registerBlock("iron_wreath_lights_white_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_MULTI_DOOR = registerBlock("acacia_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_MULTI_DOOR = registerBlock("birch_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_MULTI_DOOR = registerBlock("oak_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_MULTI_DOOR = registerBlock("spruce_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_MULTI_DOOR = registerBlock("dark_oak_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_MULTI_DOOR = registerBlock("jungle_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_MULTI_DOOR = registerBlock("crimson_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_MULTI_DOOR = registerBlock("warped_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> IRON_WREATH_LIGHTS_MULTI_DOOR = registerBlock("iron_wreath_lights_multi_door",
            () -> new MaidensDoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).noOcclusion().strength(0.5F, 2.0F).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //FENCES//

    public static final RegistryObject<Block> ACACIA_PICKET_FENCE = registerBlock("acacia_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> BIRCH_PICKET_FENCE = registerBlock("birch_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> OAK_PICKET_FENCE = registerBlock("oak_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_PICKET_FENCE = registerBlock("spruce_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_PICKET_FENCE = registerBlock("dark_oak_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_PICKET_FENCE = registerBlock("jungle_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> WARPED_PICKET_FENCE = registerBlock("warped_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_PICKET_FENCE = registerBlock("crimson_picket_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

   public static final RegistryObject<Block> ACACIA_WREATH_FENCE = registerBlock("acacia_wreath_fence",
           () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> BIRCH_WREATH_FENCE = registerBlock("birch_wreath_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> OAK_WREATH_FENCE = registerBlock("oak_wreath_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));



    public static final RegistryObject<Block> SPRUCE_WREATH_FENCE = registerBlock("spruce_wreath_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_WREATH_FENCE = registerBlock("dark_oak_wreath_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_WREATH_FENCE = registerBlock("jungle_wreath_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> WARPED_WREATH_FENCE = registerBlock("warped_wreath_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_WREATH_FENCE = registerBlock("crimson_wreath_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_FENCE = registerBlock("acacia_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_FENCE = registerBlock("birch_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_FENCE = registerBlock("oak_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_FENCE = registerBlock("spruce_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_FENCE = registerBlock("dark_oak_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_FENCE = registerBlock("jungle_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_FENCE = registerBlock("warped_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_FENCE = registerBlock("crimson_wreath_lights_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_MULTI_FENCE = registerBlock("acacia_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_MULTI_FENCE = registerBlock("birch_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_MULTI_FENCE = registerBlock("oak_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_MULTI_FENCE = registerBlock("spruce_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_MULTI_FENCE = registerBlock("dark_oak_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_MULTI_FENCE = registerBlock("jungle_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_MULTI_FENCE = registerBlock("warped_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_MULTI_FENCE = registerBlock("crimson_wreath_multi_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GATES//

    public static final RegistryObject<Block> ACACIA_PICKET_FENCE_GATE = registerBlock("acacia_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> BIRCH_PICKET_FENCE_GATE = registerBlock("birch_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> OAK_PICKET_FENCE_GATE = registerBlock("oak_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_PICKET_FENCE_GATE = registerBlock("spruce_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_PICKET_FENCE_GATE = registerBlock("dark_oak_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_PICKET_FENCE_GATE = registerBlock("jungle_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> WARPED_PICKET_FENCE_GATE = registerBlock("warped_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_PICKET_FENCE_GATE = registerBlock("crimson_picket_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_WREATH_FENCE_GATE = registerBlock("acacia_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> BIRCH_WREATH_FENCE_GATE = registerBlock("birch_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> OAK_WREATH_FENCE_GATE = registerBlock("oak_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> SPRUCE_WREATH_FENCE_GATE = registerBlock("spruce_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> DARK_OAK_WREATH_FENCE_GATE = registerBlock("dark_oak_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> JUNGLE_WREATH_FENCE_GATE = registerBlock("jungle_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> WARPED_WREATH_FENCE_GATE = registerBlock("warped_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> CRIMSON_WREATH_FENCE_GATE = registerBlock("crimson_wreath_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()));

    public static final RegistryObject<Block> ACACIA_WREATH_LIGHTS_FENCE_GATE = registerBlock("acacia_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_LIGHTS_FENCE_GATE = registerBlock("birch_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_LIGHTS_FENCE_GATE = registerBlock("oak_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_LIGHTS_FENCE_GATE = registerBlock("spruce_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_LIGHTS_FENCE_GATE = registerBlock("dark_oak_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_LIGHTS_FENCE_GATE = registerBlock("jungle_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_LIGHTS_FENCE_GATE = registerBlock("warped_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_LIGHTS_FENCE_GATE = registerBlock("crimson_wreath_lights_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_WREATH_MULTI_FENCE_GATE = registerBlock("acacia_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_WREATH_MULTI_FENCE_GATE = registerBlock("birch_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_WREATH_MULTI_FENCE_GATE = registerBlock("oak_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_WREATH_MULTI_FENCE_GATE = registerBlock("spruce_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_WREATH_MULTI_FENCE_GATE = registerBlock("dark_oak_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_WREATH_MULTI_FENCE_GATE = registerBlock("jungle_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_WREATH_MULTI_FENCE_GATE = registerBlock("warped_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_WREATH_MULTI_FENCE_GATE = registerBlock("crimson_wreath_multi_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GARLAND-DECORATED WALLS//

    //WALLS//
    public static final RegistryObject<Block>COBBLESTONE_GARLAND_WALL= registerBlock("cobblestone_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>COBBLESTONE_GARLAND_LIGHTS_WALL= registerBlock("cobblestone_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>COBBLESTONE_GARLAND_MULTI_WALL= registerBlock("cobblestone_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>ANDESITE_GARLAND_WALL= registerBlock("andesite_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>ANDESITE_GARLAND_LIGHTS_WALL= registerBlock("andesite_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>ANDESITE_GARLAND_MULTI_WALL= registerBlock("andesite_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>MOSSY_COBBLESTONE_GARLAND_WALL= registerBlock("mossy_cobblestone_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>MOSSY_COBBLESTONE_GARLAND_LIGHTS_WALL= registerBlock("mossy_cobblestone_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>MOSSY_COBBLESTONE_GARLAND_MULTI_WALL= registerBlock("mossy_cobblestone_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>BRICK_GARLAND_WALL= registerBlock("brick_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>BRICK_GARLAND_LIGHTS_WALL= registerBlock("brick_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>BRICK_GARLAND_MULTI_WALL= registerBlock("brick_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>PRISMARINE_GARLAND_WALL= registerBlock("prismarine_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>PRISMARINE_GARLAND_LIGHTS_WALL= registerBlock("prismarine_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>PRISMARINE_GARLAND_MULTI_WALL= registerBlock("prismarine_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>RED_SANDSTONE_GARLAND_WALL= registerBlock("red_sandstone_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>RED_SANDSTONE_GARLAND_LIGHTS_WALL= registerBlock("red_sandstone_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>RED_SANDSTONE_GARLAND_MULTI_WALL= registerBlock("red_sandstone_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>GRANITE_GARLAND_WALL= registerBlock("granite_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>GRANITE_GARLAND_LIGHTS_WALL= registerBlock("granite_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>GRANITE_GARLAND_MULTI_WALL= registerBlock("granite_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>STONE_BRICK_GARLAND_WALL= registerBlock("stone_brick_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>STONE_BRICK_GARLAND_LIGHTS_WALL= registerBlock("stone_brick_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>STONE_BRICK_GARLAND_MULTI_WALL= registerBlock("stone_brick_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>NETHER_BRICK_GARLAND_WALL= registerBlock("nether_brick_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>NETHER_BRICK_GARLAND_LIGHTS_WALL= registerBlock("nether_brick_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>NETHER_BRICK_GARLAND_MULTI_WALL= registerBlock("nether_brick_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>RED_NETHER_BRICK_GARLAND_WALL= registerBlock("red_nether_brick_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>RED_NETHER_BRICK_GARLAND_LIGHTS_WALL= registerBlock("red_nether_brick_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>RED_NETHER_BRICK_GARLAND_MULTI_WALL= registerBlock("red_nether_brick_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>SANDSTONE_GARLAND_WALL= registerBlock("sandstone_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>SANDSTONE_GARLAND_LIGHTS_WALL= registerBlock("sandstone_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>SANDSTONE_GARLAND_MULTI_WALL= registerBlock("sandstone_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>END_STONE_GARLAND_WALL= registerBlock("end_stone_brick_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>END_STONE_GARLAND_LIGHTS_WALL= registerBlock("end_stone_brick_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>END_STONE_GARLAND_MULTI_WALL= registerBlock("end_stone_brick_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DIORITE_GARLAND_WALL= registerBlock("diorite_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DIORITE_GARLAND_LIGHTS_WALL= registerBlock("diorite_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DIORITE_GARLAND_MULTI_WALL= registerBlock("diorite_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>BLACKSTONE_GARLAND_WALL= registerBlock("blackstone_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>BLACKSTONE_GARLAND_LIGHTS_WALL= registerBlock("blackstone_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>BLACKSTONE_GARLAND_MULTI_WALL= registerBlock("blackstone_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_BLACKSTONE_GARLAND_WALL= registerBlock("polished_blackstone_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_BLACKSTONE_GARLAND_LIGHTS_WALL= registerBlock("polished_blackstone_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_BLACKSTONE_GARLAND_MULTI_WALL= registerBlock("polished_blackstone_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_BLACKSTONE_BRICK_GARLAND_WALL= registerBlock("polished_blackstone_brick_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_BLACKSTONE_BRICK_GARLAND_LIGHTS_WALL= registerBlock("polished_blackstone_brick_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_BLACKSTONE_BRICK_GARLAND_MULTI_WALL= registerBlock("polished_blackstone_brick_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>COBBLED_DEEPSLATE_GARLAND_WALL= registerBlock("cobbled_deepslate_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>COBBLED_DEEPSLATE_GARLAND_LIGHTS_WALL= registerBlock("cobbled_deepslate_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>COBBLED_DEEPSLATE_GARLAND_MULTI_WALL= registerBlock("cobbled_deepslate_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_DEEPSLATE_GARLAND_WALL= registerBlock("polished_deepslate_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_DEEPSLATE_GARLAND_LIGHTS_WALL= registerBlock("polished_deepslate_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>POLISHED_DEEPSLATE_GARLAND_MULTI_WALL= registerBlock("polished_deepslate_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DEEPSLATE_BRICK_GARLAND_WALL= registerBlock("deepslate_brick_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DEEPSLATE_BRICK_GARLAND_LIGHTS_WALL= registerBlock("deepslate_brick_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DEEPSLATE_BRICK_GARLAND_MULTI_WALL= registerBlock("deepslate_brick_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DEEPSLATE_TILE_GARLAND_WALL= registerBlock("deepslate_tile_garland_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion()), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DEEPSLATE_TILE_GARLAND_LIGHTS_WALL= registerBlock("deepslate_tile_garland_lights_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>DEEPSLATE_TILE_GARLAND_MULTI_WALL= registerBlock("deepslate_tile_garland_multi_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.6F, 2.5F).noOcclusion().lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

//LEAVES-BUSHES//
 public static final RegistryObject<Block>SPRUCE_LEAVES_HOLLY= registerBlock("spruce_leaves_holly",
         () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F, 2.5F).noOcclusion().sound(SoundType.CROP)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>SPRUCE_LEAVES_LIGHTS_WHITE= registerBlock("spruce_leaves_lights_white",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F, 2.5F).noOcclusion().sound(SoundType.CROP).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>SPRUCE_LEAVES_LIGHTS_LARGE_WHITE= registerBlock("spruce_leaves_lights_large_white",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F, 2.5F).noOcclusion().sound(SoundType.CROP).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>SPRUCE_LEAVES_LIGHTS_MULTI= registerBlock("spruce_leaves_lights_multi",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F, 2.5F).noOcclusion().sound(SoundType.CROP).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>SPRUCE_LEAVES_LIGHTS_LARGE_MULTI= registerBlock("spruce_leaves_lights_large_multi",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F, 2.5F).noOcclusion().sound(SoundType.CROP).lightLevel((p_50828_) -> { return 12; })), ModItemGroups.MAIDENS_BLOCKS_GROUP);

























    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroups.MAIDENS_BLOCKS_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}