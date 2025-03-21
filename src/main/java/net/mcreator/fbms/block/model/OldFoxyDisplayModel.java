package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OldFoxyDisplayItem;

public class OldFoxyDisplayModel extends GeoModel<OldFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OldFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldFoxyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/dinerfoxy.png");
	}
}
