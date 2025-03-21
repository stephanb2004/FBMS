package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Endo02DisplayItem;

public class Endo02DisplayModel extends GeoModel<Endo02DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo02DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/endo02v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/endo02v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/endo02v2.png");
	}
}
