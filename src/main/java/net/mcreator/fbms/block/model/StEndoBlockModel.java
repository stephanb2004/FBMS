package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.StEndoTileEntity;

public class StEndoBlockModel extends GeoModel<StEndoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/st_endo_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/st_endo_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/st_endo.png");
	}
}
