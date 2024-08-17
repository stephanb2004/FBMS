package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PuffyPuffinsAnimatedTileEntity;

public class PuffyPuffinsAnimatedBlockModel extends AnimatedGeoModel<PuffyPuffinsAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuffyPuffinsAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/puffypuffins_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuffyPuffinsAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/puffypuffins_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuffyPuffinsAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/puffy_puffins.png");
	}
}
