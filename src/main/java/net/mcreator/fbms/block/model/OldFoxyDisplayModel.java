package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OldFoxyDisplayItem;

public class OldFoxyDisplayModel extends AnimatedGeoModel<OldFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldFoxyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/dinerfoxy.png");
	}
}
