package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.TheMangleTileEntity;

public class TheMangleBlockModel extends AnimatedGeoModel<TheMangleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheMangleTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheMangleTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheMangleTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/obhf_mangle.png");
	}
}
