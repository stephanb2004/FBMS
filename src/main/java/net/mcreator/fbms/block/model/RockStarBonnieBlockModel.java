package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarBonnieTileEntity;

public class RockStarBonnieBlockModel extends AnimatedGeoModel<RockStarBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarBonnieTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/rbonnie.png");
	}
}