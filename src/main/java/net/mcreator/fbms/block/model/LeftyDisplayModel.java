package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LeftyDisplayItem;

public class LeftyDisplayModel extends GeoModel<LeftyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeftyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/leftyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/leftyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/leftyv2v2.png");
	}
}
