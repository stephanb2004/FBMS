package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OldBonnieDisplayItem;

public class OldBonnieDisplayModel extends AnimatedGeoModel<OldBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dinerbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dinerbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldBonnieDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/dinerbonnie.png");
	}
}
