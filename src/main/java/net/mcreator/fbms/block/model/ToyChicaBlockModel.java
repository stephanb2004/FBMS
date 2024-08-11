package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ToyChicaTileEntity;

public class ToyChicaBlockModel extends AnimatedGeoModel<ToyChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/toychica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/toychica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/toychica.png");
	}
}
