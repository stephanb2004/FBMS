package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NoveltyTrafficLightTileEntity;

public class NoveltyTrafficLightBlockModel extends GeoModel<NoveltyTrafficLightTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NoveltyTrafficLightTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/stolen_traffic_light.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NoveltyTrafficLightTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/stolen_traffic_light.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NoveltyTrafficLightTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/itsafreetexture.png");
	}
}
