package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PuffyPuffinsAnimatedTileEntity;

public class PuffyPuffinsAnimatedBlockModel extends GeoModel<PuffyPuffinsAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuffyPuffinsAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/puffypuffins_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuffyPuffinsAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/puffypuffins_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuffyPuffinsAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/puffy_puffins.png");
	}
}
