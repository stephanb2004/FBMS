package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FredBearTileEntity;

public class FredBearBlockModel extends AnimatedGeoModel<FredBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fredbeara.png");
	}
}
