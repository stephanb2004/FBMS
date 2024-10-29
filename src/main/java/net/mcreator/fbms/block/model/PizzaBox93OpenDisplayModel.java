package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox93OpenDisplayItem;

public class PizzaBox93OpenDisplayModel extends AnimatedGeoModel<PizzaBox93OpenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox93OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox93OpenDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox93OpenDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_pizzabox93.png");
	}
}
