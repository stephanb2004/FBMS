package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarFoxyTileEntity;

public class RockStarFoxyBlockModel extends GeoModel<RockStarFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rfoxyv2.png");
	}
}
