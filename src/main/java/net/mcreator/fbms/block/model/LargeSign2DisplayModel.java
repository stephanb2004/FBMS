package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LargeSign2DisplayItem;

public class LargeSign2DisplayModel extends GeoModel<LargeSign2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LargeSign2DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/sign2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSign2DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/sign2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSign2DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/amgous.png");
	}
}
