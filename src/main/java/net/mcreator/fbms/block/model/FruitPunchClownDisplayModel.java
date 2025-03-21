package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FruitPunchClownDisplayItem;

public class FruitPunchClownDisplayModel extends GeoModel<FruitPunchClownDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FruitPunchClownDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fruint_punch_clown.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FruitPunchClownDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fruint_punch_clown.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FruitPunchClownDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fruit_punch_clown.png");
	}
}
