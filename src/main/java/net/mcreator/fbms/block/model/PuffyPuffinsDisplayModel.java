package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PuffyPuffinsDisplayItem;

public class PuffyPuffinsDisplayModel extends AnimatedGeoModel<PuffyPuffinsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuffyPuffinsDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/puffypuffins_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuffyPuffinsDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/puffypuffins_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuffyPuffinsDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/puffy_puffins.png");
	}
}
