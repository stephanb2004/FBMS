package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RetroChicaAnimatedTileEntity;

public class RetroChicaAnimatedBlockModel extends GeoModel<RetroChicaAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/retrochica_anim.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/retrochica_anim.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/retrochica.png");
	}
}
