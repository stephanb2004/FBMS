package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ToyFoxyTileEntity;

public class ToyFoxyBlockModel extends AnimatedGeoModel<ToyFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/toyfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/toyfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/tfoxyv2.png");
	}
}
