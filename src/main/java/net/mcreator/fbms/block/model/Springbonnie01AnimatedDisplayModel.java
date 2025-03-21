package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Springbonnie01AnimatedDisplayItem;

public class Springbonnie01AnimatedDisplayModel extends GeoModel<Springbonnie01AnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Springbonnie01AnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/01_springbonnie_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Springbonnie01AnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/01_springbonnie_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Springbonnie01AnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/01_springbonnie.png");
	}
}
