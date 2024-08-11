package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OldFreddyDisplayItem;

public class OldFreddyDisplayModel extends AnimatedGeoModel<OldFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dinerfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dinerfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/dinerfreddy.png");
	}
}
