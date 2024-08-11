package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PicklesDisplayItem;

public class PicklesDisplayModel extends AnimatedGeoModel<PicklesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PicklesDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pickles.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PicklesDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pickles.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PicklesDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/pickles.png");
	}
}
