package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FoxyDisplayItem;

public class FoxyDisplayModel extends GeoModel<FoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/foxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/foxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/foxyv2.png");
	}
}
