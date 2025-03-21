package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.HazyReindeerAnimatedDisplayItem;

public class HazyReindeerAnimatedDisplayModel extends GeoModel<HazyReindeerAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HazyReindeerAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/hazyreindeer_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HazyReindeerAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/hazyreindeer_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HazyReindeerAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/hazy_reindeer.png");
	}
}
