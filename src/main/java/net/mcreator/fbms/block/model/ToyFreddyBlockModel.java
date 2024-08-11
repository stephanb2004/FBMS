package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ToyFreddyTileEntity;

public class ToyFreddyBlockModel extends AnimatedGeoModel<ToyFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/toyfreddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/toyfreddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/toyfreddyv2.png");
	}
}
