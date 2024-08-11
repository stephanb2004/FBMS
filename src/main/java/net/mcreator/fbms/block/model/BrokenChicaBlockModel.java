package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BrokenChicaTileEntity;

public class BrokenChicaBlockModel extends AnimatedGeoModel<BrokenChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/chicabroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/chicabroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenChicaTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/chicabroken.png");
	}
}
