package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CamTileEntity;

public class CamBlockModel extends GeoModel<CamTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CamTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/cam.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CamTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/cam.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CamTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/cam.png");
	}
}
