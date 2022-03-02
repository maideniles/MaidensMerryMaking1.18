package com.maideniles.maidensmerrymaking.items.armor;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RedChristmasArmorModel extends HumanoidModel<LivingEntity>
{
	public static RedChristmasArmorModel INSTANCE;
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MaidensMerryMaking.MOD_ID, "red_christmas_head"), "main");

	public RedChristmasArmorModel(ModelPart root)
	{
		super(root);
	}

	public static LayerDefinition createBodyLayer()
	{
		MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);

		head.addOrReplaceChild("hat_1", CubeListBuilder.create()
						.texOffs(0, 0)
						.addBox(-4F, -8F, -4F, 8F, 8F, 8F,
								new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0F, 0F, 0F, 0F, 0F, 0F));

		head.addOrReplaceChild("hat_2", CubeListBuilder.create()
						.texOffs(24, 0)
						.addBox(-3.5F, -9.5F, -3.5F, 7F, 1F, 7F,
								new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0F, 0F, 0F, 0F, 0F, 0F));

		return LayerDefinition.create(meshdefinition, 64, 64);

	}



	@Override
	protected Iterable<ModelPart> bodyParts()
	{
		return ImmutableList.of();
	}

	@SubscribeEvent
	public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event)
	{
		event.registerLayerDefinition(LAYER_LOCATION, RedChristmasArmorModel::createBodyLayer);
	}

	@SubscribeEvent
	public static void bakeModelLayers(EntityRenderersEvent.AddLayers event)
	{
		EntityModelSet entityModelSet = event.getEntityModels();
		INSTANCE = new RedChristmasArmorModel(entityModelSet.bakeLayer(LAYER_LOCATION));
	}

}