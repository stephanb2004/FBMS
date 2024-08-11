package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.GravityVortex2DisplayItem;

public class GravityVortex2DisplayModel extends AnimatedGeoModel<GravityVortex2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GravityVortex2DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/gravityvortex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravityVortex2DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/gravityvortex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravityVortex2DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/the_orb.png");
	}
}
