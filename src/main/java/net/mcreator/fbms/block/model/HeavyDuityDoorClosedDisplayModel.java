package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.HeavyDuityDoorClosedDisplayItem;

public class HeavyDuityDoorClosedDisplayModel extends GeoModel<HeavyDuityDoorClosedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HeavyDuityDoorClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/metaldoorclose.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyDuityDoorClosedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/metaldoorclose.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyDuityDoorClosedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/crashdoor.png");
	}
}
