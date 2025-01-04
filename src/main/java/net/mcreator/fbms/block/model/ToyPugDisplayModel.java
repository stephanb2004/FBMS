package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ToyPugDisplayItem;

public class ToyPugDisplayModel extends AnimatedGeoModel<ToyPugDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyPugDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/toypug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyPugDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/toypug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyPugDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/toypug.png");
	}
}
