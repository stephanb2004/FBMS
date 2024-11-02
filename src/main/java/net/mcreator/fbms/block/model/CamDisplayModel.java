package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CamDisplayItem;

public class CamDisplayModel extends AnimatedGeoModel<CamDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CamDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/cam.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CamDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/cam.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CamDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/cam.png");
	}
}
