package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SanitationStationDisplayItem;

public class SanitationStationDisplayModel extends AnimatedGeoModel<SanitationStationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SanitationStationDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fmssanitationstation.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SanitationStationDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fmssanitationstation.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SanitationStationDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fmssanitationstation.png");
	}
}
