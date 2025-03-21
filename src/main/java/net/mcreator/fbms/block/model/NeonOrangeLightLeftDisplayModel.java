package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonOrangeLightLeftDisplayItem;

public class NeonOrangeLightLeftDisplayModel extends GeoModel<NeonOrangeLightLeftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonOrangeLightLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonOrangeLightLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonOrangeLightLeftDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonorangeleft.png");
	}
}
