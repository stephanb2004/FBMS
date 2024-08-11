package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DougTheDogDisplayItem;

public class DougTheDogDisplayModel extends AnimatedGeoModel<DougTheDogDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DougTheDogDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dougthedog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougTheDogDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dougthedog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougTheDogDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/dougthedog.png");
	}
}
