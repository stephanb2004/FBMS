package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LeftyTileEntity;

public class LeftyBlockModel extends AnimatedGeoModel<LeftyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeftyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/leftyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/leftyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/leftyv2.png");
	}
}
