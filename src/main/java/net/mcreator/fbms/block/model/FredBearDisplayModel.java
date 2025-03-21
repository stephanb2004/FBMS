package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FredBearDisplayItem;

public class FredBearDisplayModel extends GeoModel<FredBearDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/block/fredbeara.png");
	}
}
