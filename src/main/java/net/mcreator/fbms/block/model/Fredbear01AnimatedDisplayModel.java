package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Fredbear01AnimatedDisplayItem;

public class Fredbear01AnimatedDisplayModel extends GeoModel<Fredbear01AnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fredbear01AnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/01_fredbear_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fredbear01AnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/01_fredbear_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fredbear01AnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/01_fredbear.png");
	}
}
