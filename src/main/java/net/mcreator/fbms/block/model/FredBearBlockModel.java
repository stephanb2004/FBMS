package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FredBearTileEntity;

public class FredBearBlockModel extends GeoModel<FredBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/fredbeara.png");
	}
}
