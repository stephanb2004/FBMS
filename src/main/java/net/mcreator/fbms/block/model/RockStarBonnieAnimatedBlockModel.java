package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarBonnieAnimatedTileEntity;

public class RockStarBonnieAnimatedBlockModel extends GeoModel<RockStarBonnieAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarBonnieAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rbonniea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarBonnieAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rbonniea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarBonnieAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rbonnie.png");
	}
}
