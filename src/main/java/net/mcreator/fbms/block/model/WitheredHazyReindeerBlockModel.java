package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WitheredHazyReindeerTileEntity;

public class WitheredHazyReindeerBlockModel extends GeoModel<WitheredHazyReindeerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredHazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/withered_hazyreindeer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredHazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/withered_hazyreindeer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredHazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/hazy_reindeer_withered.png");
	}
}
