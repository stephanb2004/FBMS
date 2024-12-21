package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Fredbear01DisplayItem;

public class Fredbear01DisplayModel extends AnimatedGeoModel<Fredbear01DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fredbear01DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/01_fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fredbear01DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/01_fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fredbear01DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/01_fredbear.png");
	}
}
