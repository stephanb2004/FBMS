package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BarryPolarAnimatedTileEntity;

public class BarryPolarAnimatedBlockModel extends AnimatedGeoModel<BarryPolarAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/barrypolaranimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/barrypolaranimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fixedv2.png");
	}
}
