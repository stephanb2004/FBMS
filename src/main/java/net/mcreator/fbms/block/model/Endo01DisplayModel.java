package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Endo01DisplayItem;

public class Endo01DisplayModel extends GeoModel<Endo01DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/endo01.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/endo01.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/endo01.png");
	}
}
