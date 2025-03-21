package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BarryPolarFixedTileEntity;

public class BarryPolarFixedBlockModel extends GeoModel<BarryPolarFixedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarFixedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/barrypolarfixedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarFixedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/barrypolarfixedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarFixedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fixedv2.png");
	}
}
