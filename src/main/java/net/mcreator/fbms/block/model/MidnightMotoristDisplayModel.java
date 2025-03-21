package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MidnightMotoristDisplayItem;

public class MidnightMotoristDisplayModel extends GeoModel<MidnightMotoristDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MidnightMotoristDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/midnight_motorist.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MidnightMotoristDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/midnight_motorist.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MidnightMotoristDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/midnight_motorist.png");
	}
}
