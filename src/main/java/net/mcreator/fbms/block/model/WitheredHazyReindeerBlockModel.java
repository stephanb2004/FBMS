package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WitheredHazyReindeerTileEntity;

public class WitheredHazyReindeerBlockModel extends AnimatedGeoModel<WitheredHazyReindeerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredHazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/withered_hazyreindeer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredHazyReindeerTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/withered_hazyreindeer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredHazyReindeerTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/hazy_reindeer_withered.png");
	}
}
