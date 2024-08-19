package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Megaultimatespeakertron3000TileEntity;

public class Megaultimatespeakertron3000BlockModel extends AnimatedGeoModel<Megaultimatespeakertron3000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Megaultimatespeakertron3000TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/stolen_traffic_light.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Megaultimatespeakertron3000TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/stolen_traffic_light.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Megaultimatespeakertron3000TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/stage_speaker.png");
	}
}
