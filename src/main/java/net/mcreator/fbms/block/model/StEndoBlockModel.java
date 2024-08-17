package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.StEndoTileEntity;

public class StEndoBlockModel extends AnimatedGeoModel<StEndoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/st_endo_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/st_endo_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StEndoTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/st_endo.png");
	}
}
