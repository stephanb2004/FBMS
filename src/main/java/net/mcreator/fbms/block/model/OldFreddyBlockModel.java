package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OldFreddyTileEntity;

public class OldFreddyBlockModel extends AnimatedGeoModel<OldFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldFreddyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/dinerfreddy.png");
	}
}
