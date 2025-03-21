package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarBonnieTileEntity;

public class RockStarBonnieBlockModel extends GeoModel<RockStarBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rbonnie.png");
	}
}
