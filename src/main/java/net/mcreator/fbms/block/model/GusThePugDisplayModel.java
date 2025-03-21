package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.GusThePugDisplayItem;

public class GusThePugDisplayModel extends GeoModel<GusThePugDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/gus_the_pug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/gus_the_pug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/gus_the_pug.png");
	}
}
