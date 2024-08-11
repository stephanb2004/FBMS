package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ChicaDisplayItem;

public class ChicaDisplayModel extends AnimatedGeoModel<ChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/chica.png");
	}
}
