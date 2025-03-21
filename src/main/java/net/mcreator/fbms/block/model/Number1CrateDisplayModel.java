package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Number1CrateDisplayItem;

public class Number1CrateDisplayModel extends GeoModel<Number1CrateDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Number1CrateDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/numberonecrate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Number1CrateDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/numberonecrate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Number1CrateDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/1_crate.png");
	}
}
