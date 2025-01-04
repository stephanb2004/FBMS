package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FredBearDisplayItem;

public class FredBearDisplayModel extends AnimatedGeoModel<FredBearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredBearDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fredbeara.png");
	}
}
