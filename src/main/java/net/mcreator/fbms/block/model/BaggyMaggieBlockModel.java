package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BaggyMaggieTileEntity;

public class BaggyMaggieBlockModel extends GeoModel<BaggyMaggieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BaggyMaggieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/baggymaggie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaggyMaggieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/baggymaggie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaggyMaggieTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/baggymaggie.png");
	}
}
