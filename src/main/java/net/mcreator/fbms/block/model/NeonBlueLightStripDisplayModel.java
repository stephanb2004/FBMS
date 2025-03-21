package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonBlueLightStripDisplayItem;

public class NeonBlueLightStripDisplayModel extends GeoModel<NeonBlueLightStripDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonBlueLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonBlueLightStripDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonBlueLightStripDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonbluestripe.png");
	}
}
