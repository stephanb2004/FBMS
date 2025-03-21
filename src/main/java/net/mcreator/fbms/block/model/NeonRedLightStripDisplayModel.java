package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonRedLightStripDisplayItem;

public class NeonRedLightStripDisplayModel extends GeoModel<NeonRedLightStripDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonredstripe.png");
	}
}
