package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.HazyReindeerAnimatedTileEntity;

public class HazyReindeerAnimatedBlockModel extends GeoModel<HazyReindeerAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HazyReindeerAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/hazyreindeer_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HazyReindeerAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/hazyreindeer_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HazyReindeerAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/hazy_reindeer.png");
	}
}
