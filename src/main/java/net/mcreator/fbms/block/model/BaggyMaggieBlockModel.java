package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BaggyMaggieTileEntity;

public class BaggyMaggieBlockModel extends AnimatedGeoModel<BaggyMaggieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BaggyMaggieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/baggymaggie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaggyMaggieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/baggymaggie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaggyMaggieTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/baggymaggie.png");
	}
}
