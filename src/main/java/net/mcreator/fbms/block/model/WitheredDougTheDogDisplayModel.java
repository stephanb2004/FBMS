package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WitheredDougTheDogDisplayItem;

public class WitheredDougTheDogDisplayModel extends GeoModel<WitheredDougTheDogDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredDougTheDogDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wdoug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredDougTheDogDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wdoug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredDougTheDogDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/withered_doug.png");
	}
}
