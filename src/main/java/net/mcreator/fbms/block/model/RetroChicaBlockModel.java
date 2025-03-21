package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RetroChicaTileEntity;

public class RetroChicaBlockModel extends GeoModel<RetroChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/retrochica_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/retrochica_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/retrochica.png");
	}
}
