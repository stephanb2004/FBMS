package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarFreddyAnimatedTileEntity;

public class RockStarFreddyAnimatedBlockModel extends GeoModel<RockStarFreddyAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFreddyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rfreddyanimatedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFreddyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rfreddyanimatedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFreddyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rockstar_freddy.png");
	}
}
