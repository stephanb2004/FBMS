package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ShredBearTileEntity;

public class ShredBearBlockModel extends GeoModel<ShredBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/shredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/shredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShredBearTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/shreadbear.png");
	}
}
