package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonOrangeLightStripRightDisplayItem;

public class NeonOrangeLightStripRightDisplayModel extends GeoModel<NeonOrangeLightStripRightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonOrangeLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonOrangeLightStripRightDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonOrangeLightStripRightDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonorangeright.png");
	}
}
