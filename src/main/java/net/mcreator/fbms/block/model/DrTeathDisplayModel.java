package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DrTeathDisplayItem;

public class DrTeathDisplayModel extends GeoModel<DrTeathDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DrTeathDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/drteeth.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrTeathDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/drteeth.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrTeathDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/ce1752722ffa8ee475268bbcf59d105027539643.png");
	}
}
