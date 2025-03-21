package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.HazyReindeerDisplayItem;

public class HazyReindeerDisplayModel extends GeoModel<HazyReindeerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HazyReindeerDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/hazyreindeer_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HazyReindeerDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/hazyreindeer_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HazyReindeerDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/hazy_reindeer.png");
	}
}
