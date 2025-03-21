package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PicklesDisplayItem;

public class PicklesDisplayModel extends GeoModel<PicklesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PicklesDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pickles.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PicklesDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pickles.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PicklesDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/pickles.png");
	}
}
