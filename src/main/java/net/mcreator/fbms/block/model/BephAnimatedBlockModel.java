package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BephAnimatedTileEntity;

public class BephAnimatedBlockModel extends AnimatedGeoModel<BephAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BephAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/beph.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BephAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/beph.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BephAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/beph.png");
	}
}
