package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LeftyTileEntity;

public class LeftyBlockModel extends GeoModel<LeftyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeftyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/leftyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/leftyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/leftyv2v2.png");
	}
}
