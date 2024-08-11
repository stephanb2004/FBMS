package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ShredBearTileEntity;

public class ShredBearBlockModel extends AnimatedGeoModel<ShredBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/shredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/shredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShredBearTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/shreadbear.png");
	}
}
