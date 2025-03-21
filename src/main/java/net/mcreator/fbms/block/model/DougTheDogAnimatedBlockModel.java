package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DougTheDogAnimatedTileEntity;

public class DougTheDogAnimatedBlockModel extends GeoModel<DougTheDogAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DougTheDogAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dougthedog_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougTheDogAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dougthedog_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougTheDogAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/dougthedog.png");
	}
}
