package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.GravityVortexDisplayItem;

public class GravityVortexDisplayModel extends AnimatedGeoModel<GravityVortexDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GravityVortexDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fmsgravityvortex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravityVortexDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fmsgravityvortex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravityVortexDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/the_orb.png");
	}
}
