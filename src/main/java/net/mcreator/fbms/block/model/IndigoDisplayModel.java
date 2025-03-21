package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.IndigoDisplayItem;

public class IndigoDisplayModel extends GeoModel<IndigoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IndigoDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ftfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndigoDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ftfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndigoDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/indigo.png");
	}
}
