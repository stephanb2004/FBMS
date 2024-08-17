package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WitheredPuffyPuffinsDisplayItem;

public class WitheredPuffyPuffinsDisplayModel extends AnimatedGeoModel<WitheredPuffyPuffinsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredPuffyPuffinsDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/withered_puffypuffins.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredPuffyPuffinsDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/withered_puffypuffins.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredPuffyPuffinsDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/puffy_puffins_withered.png");
	}
}
