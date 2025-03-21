package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.StEndoAnimatedTileEntity;

public class StEndoAnimatedBlockModel extends GeoModel<StEndoAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/st_endo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/st_endo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/st_endo.png");
	}
}
