package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarChicaAnimatedTileEntity;

public class RockStarChicaAnimatedBlockModel extends GeoModel<RockStarChicaAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rchicaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rchicaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarChicaAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rockstar_chica.png");
	}
}
