package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LadderTowerTileEntity;

public class LadderTowerBlockModel extends AnimatedGeoModel<LadderTowerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LadderTowerTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ladder_tower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LadderTowerTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ladder_tower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LadderTowerTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/laddertower.png");
	}
}