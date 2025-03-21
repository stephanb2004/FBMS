package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarFoxyAnimatedTileEntity;

public class RockStarFoxyAnimatedBlockModel extends GeoModel<RockStarFoxyAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFoxyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rfoxyanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFoxyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rfoxyanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFoxyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rfoxyv2.png");
	}
}
