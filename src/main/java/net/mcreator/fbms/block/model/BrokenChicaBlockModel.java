package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BrokenChicaTileEntity;

public class BrokenChicaBlockModel extends GeoModel<BrokenChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/chicabroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/chicabroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/chicabroken.png");
	}
}
