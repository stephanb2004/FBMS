package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonRedLightStripRightDisplayItem;

public class NeonRedLightStripRightDisplayModel extends GeoModel<NeonRedLightStripRightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonRedLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonRedLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonRedLightStripRightDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonredright.png");
	}
}
