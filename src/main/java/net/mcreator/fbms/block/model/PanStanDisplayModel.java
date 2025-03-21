package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PanStanDisplayItem;

public class PanStanDisplayModel extends GeoModel<PanStanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PanStanDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pan_stan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PanStanDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pan_stan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PanStanDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/panstan.png");
	}
}
