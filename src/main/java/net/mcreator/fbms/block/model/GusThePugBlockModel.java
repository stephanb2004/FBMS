package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GusThePugTileEntity;

public class GusThePugBlockModel extends AnimatedGeoModel<GusThePugTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/gus_the_pug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/gus_the_pug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/gus_the_pug.png");
	}
}
