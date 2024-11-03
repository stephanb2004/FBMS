package net.mcreator.fbms.block.model;

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