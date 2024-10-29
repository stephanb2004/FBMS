package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox87OpenDisplayItem;

public class PizzaBox87OpenDisplayModel extends AnimatedGeoModel<PizzaBox87OpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox87OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox87OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox87OpenDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox87.png");
	}
}
