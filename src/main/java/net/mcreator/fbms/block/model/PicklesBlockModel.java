package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PicklesTileEntity;

public class PicklesBlockModel extends AnimatedGeoModel<PicklesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PicklesTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pickles.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PicklesTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pickles.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PicklesTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/pickles.png");
	}
}
