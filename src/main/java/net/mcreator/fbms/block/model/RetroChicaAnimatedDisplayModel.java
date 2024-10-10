package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RetroChicaAnimatedDisplayItem;

public class RetroChicaAnimatedDisplayModel extends AnimatedGeoModel<RetroChicaAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/retrochica_anim.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/retrochica_anim.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/retrochica.png");
	}
}
