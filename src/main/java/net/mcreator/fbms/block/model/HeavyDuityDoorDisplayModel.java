package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.HeavyDuityDoorDisplayItem;

public class HeavyDuityDoorDisplayModel extends AnimatedGeoModel<HeavyDuityDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HeavyDuityDoorDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/metaldooropen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyDuityDoorDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/metaldooropen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyDuityDoorDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/crashdoor.png");
	}
}