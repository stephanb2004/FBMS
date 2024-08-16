package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaPlaceSignDisplayItem;

public class PizzaPlaceSignDisplayModel extends AnimatedGeoModel<PizzaPlaceSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaPlaceSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaPlaceSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaPlaceSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fnaf6sign.png");
	}
}
