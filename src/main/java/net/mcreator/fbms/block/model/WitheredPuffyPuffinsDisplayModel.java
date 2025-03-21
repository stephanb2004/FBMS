package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WitheredPuffyPuffinsDisplayItem;

public class WitheredPuffyPuffinsDisplayModel extends GeoModel<WitheredPuffyPuffinsDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/block/puffy_puffins_withered.png");
	}
}
