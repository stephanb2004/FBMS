package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BonnieCutOutDisplayItem;

public class BonnieCutOutDisplayModel extends GeoModel<BonnieCutOutDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnieCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieCutOutDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/bonniecutout.png");
	}
}
