package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RetroChicaTileEntity;

public class RetroChicaBlockModel extends AnimatedGeoModel<RetroChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/retrochica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/retrochica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/retrochica.png");
	}
}
