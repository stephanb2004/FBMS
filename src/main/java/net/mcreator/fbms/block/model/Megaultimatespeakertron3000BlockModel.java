package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Megaultimatespeakertron3000TileEntity;

public class Megaultimatespeakertron3000BlockModel extends AnimatedGeoModel<Megaultimatespeakertron3000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Megaultimatespeakertron3000TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/stage_speaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Megaultimatespeakertron3000TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/stage_speaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Megaultimatespeakertron3000TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/stage_speaker.png");
	}
}
