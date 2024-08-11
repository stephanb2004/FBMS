package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ChicaTileEntity;

public class ChicaBlockModel extends AnimatedGeoModel<ChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/chica.png");
	}
}
