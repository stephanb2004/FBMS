package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ChicaCutOutDisplayItem;

public class ChicaCutOutDisplayModel extends AnimatedGeoModel<ChicaCutOutDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaCutOutDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/chicacutout.png");
	}
}