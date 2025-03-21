package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonGreenLightStripDisplayItem;

public class NeonGreenLightStripDisplayModel extends GeoModel<NeonGreenLightStripDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neongreenstripes.png");
	}
}
