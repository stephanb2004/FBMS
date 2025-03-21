package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RetroChicaDisplayItem;

public class RetroChicaDisplayModel extends GeoModel<RetroChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/retrochica_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/retrochica_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/retrochica.png");
	}
}
