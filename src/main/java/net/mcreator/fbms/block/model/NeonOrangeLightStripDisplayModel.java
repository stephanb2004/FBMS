package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonOrangeLightStripDisplayItem;

public class NeonOrangeLightStripDisplayModel extends AnimatedGeoModel<NeonOrangeLightStripDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonOrangeLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonOrangeLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonOrangeLightStripDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neonorangestripe.png");
	}
}
