package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonBlueLightStripLeftDisplayItem;

public class NeonBlueLightStripLeftDisplayModel extends GeoModel<NeonBlueLightStripLeftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonBlueLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonBlueLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonBlueLightStripLeftDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonlightleft2.png");
	}
}
