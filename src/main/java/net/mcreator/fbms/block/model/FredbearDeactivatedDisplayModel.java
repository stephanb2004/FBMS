package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FredbearDeactivatedDisplayItem;

public class FredbearDeactivatedDisplayModel extends GeoModel<FredbearDeactivatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FredbearDeactivatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fredbearsit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearDeactivatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fredbearsit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearDeactivatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fredbeara.png");
	}
}
