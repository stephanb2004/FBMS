package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GtEndoAnimatedTileEntity;

public class GtEndoAnimatedBlockModel extends GeoModel<GtEndoAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GtEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/gtendo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GtEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/gtendo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GtEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/gt_endo.png");
	}
}
