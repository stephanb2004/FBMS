package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PinballToyFreddyDisplayItem;

public class PinballToyFreddyDisplayModel extends AnimatedGeoModel<PinballToyFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pinball_machine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pinball_machine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/pinballmachine_tfreddy.png");
	}
}
