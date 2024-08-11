package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarFoxyTileEntity;

public class RockStarFoxyBlockModel extends AnimatedGeoModel<RockStarFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFoxyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/rfoxyv2.png");
	}
}
