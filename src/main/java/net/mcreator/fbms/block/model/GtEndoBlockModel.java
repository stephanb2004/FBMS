package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GtEndoTileEntity;

public class GtEndoBlockModel extends GeoModel<GtEndoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GtEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/gtendo_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GtEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/gtendo_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GtEndoTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/gt_endo.png");
	}
}
