package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RoseyTileEntity;

public class RoseyBlockModel extends GeoModel<RoseyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RoseyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rosey.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoseyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rosey.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoseyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/rosey.png");
	}
}
