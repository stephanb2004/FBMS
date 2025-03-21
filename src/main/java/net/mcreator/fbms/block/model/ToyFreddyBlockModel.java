package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ToyFreddyTileEntity;

public class ToyFreddyBlockModel extends GeoModel<ToyFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/toyfreddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/toyfreddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/toyfreddyv2.png");
	}
}
