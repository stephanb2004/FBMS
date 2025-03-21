package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.IgnitedChicaTileEntity;

public class IgnitedChicaBlockModel extends GeoModel<IgnitedChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IgnitedChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ichica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IgnitedChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ichica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IgnitedChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ichica.png");
	}
}
