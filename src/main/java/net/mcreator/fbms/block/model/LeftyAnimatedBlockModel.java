package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LeftyAnimatedTileEntity;

public class LeftyAnimatedBlockModel extends AnimatedGeoModel<LeftyAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeftyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/leftyanimatedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/leftyanimatedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/leftyv2v2.png");
	}
}
