package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FuntimeDelilahblockDisplayItem;

public class FuntimeDelilahblockDisplayModel extends GeoModel<FuntimeDelilahblockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahblockDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ftdelilahv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahblockDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ftdelilahv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahblockDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/ftdelilahv2.png");
	}
}
