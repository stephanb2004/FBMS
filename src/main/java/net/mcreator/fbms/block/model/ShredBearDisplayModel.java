package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ShredBearDisplayItem;

public class ShredBearDisplayModel extends AnimatedGeoModel<ShredBearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShredBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/shredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShredBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/shredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShredBearDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/shreadbear.png");
	}
}
