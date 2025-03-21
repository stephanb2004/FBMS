package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Megaultimatespeakertron3000TileEntity;

public class Megaultimatespeakertron3000BlockModel extends GeoModel<Megaultimatespeakertron3000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Megaultimatespeakertron3000TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/stage_speaker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Megaultimatespeakertron3000TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/stage_speaker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Megaultimatespeakertron3000TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/stage_speaker.png");
	}
}
