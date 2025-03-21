package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ArcadeSignDisplayItem;

public class ArcadeSignDisplayModel extends GeoModel<ArcadeSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/arcadesign.png");
	}
}
