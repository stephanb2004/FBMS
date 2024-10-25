package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SalvagedJollyDisplayItem;

public class SalvagedJollyDisplayModel extends AnimatedGeoModel<SalvagedJollyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SalvagedJollyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/jolly_the_rat_salvaged.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SalvagedJollyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/jolly_the_rat_salvaged.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SalvagedJollyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/jolly_the_rat_salvaged.png");
	}
}