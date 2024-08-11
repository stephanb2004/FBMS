package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Endo01AnimatedDisplayItem;

public class Endo01AnimatedDisplayModel extends AnimatedGeoModel<Endo01AnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Endo01AnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/endo01a.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01AnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/endo01a.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01AnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/endo01.png");
	}
}
