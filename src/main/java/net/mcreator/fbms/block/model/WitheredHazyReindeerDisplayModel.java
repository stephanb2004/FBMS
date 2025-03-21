package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WitheredHazyReindeerDisplayItem;

public class WitheredHazyReindeerDisplayModel extends GeoModel<WitheredHazyReindeerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredHazyReindeerDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/withered_hazyreindeer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredHazyReindeerDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/withered_hazyreindeer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredHazyReindeerDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/hazy_reindeer_withered.png");
	}
}
