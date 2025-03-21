package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.GusThePugTileEntity;

public class GusThePugBlockModel extends GeoModel<GusThePugTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/gus_the_pug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/gus_the_pug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/gus_the_pug.png");
	}
}
