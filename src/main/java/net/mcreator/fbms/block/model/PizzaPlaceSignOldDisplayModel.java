package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PizzaPlaceSignOldDisplayItem;

public class PizzaPlaceSignOldDisplayModel extends AnimatedGeoModel<PizzaPlaceSignOldDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzaPlaceSignOldDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzaPlaceSignOldDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzaPlaceSignOldDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fnafsbsign.png");
	}
}
