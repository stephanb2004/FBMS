package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarFreddyTileEntity;

public class RockStarFreddyBlockModel extends GeoModel<RockStarFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rfreddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rfreddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rockstar_freddy.png");
	}
}
