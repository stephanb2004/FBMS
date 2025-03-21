package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonYellowLightStripDisplayItem;

public class NeonYellowLightStripDisplayModel extends GeoModel<NeonYellowLightStripDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonYellowLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonYellowLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonYellowLightStripDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonyellowstripe.png");
	}
}
