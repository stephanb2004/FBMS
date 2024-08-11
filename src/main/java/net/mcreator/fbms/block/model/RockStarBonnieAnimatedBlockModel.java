package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarBonnieAnimatedTileEntity;

public class RockStarBonnieAnimatedBlockModel extends AnimatedGeoModel<RockStarBonnieAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarBonnieAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rbonniea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarBonnieAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rbonniea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarBonnieAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/rbonnie.png");
	}
}
