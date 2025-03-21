package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaBox24ClosedDisplayItem;

public class PizzaBox24ClosedDisplayModel extends GeoModel<PizzaBox24ClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaBox24ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pizzabox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaBox24ClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pizzabox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaBox24ClosedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fms_pizzabox24.png");
	}
}
