package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BarryPolarDisplayItem;

public class BarryPolarDisplayModel extends GeoModel<BarryPolarDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BarryPolarDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/barrypolarsitbrokenv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BarryPolarDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/barrypolarsitbrokenv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BarryPolarDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/skinv2.png");
	}
}
