package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RottenPitDisplayItem;

public class RottenPitDisplayModel extends AnimatedGeoModel<RottenPitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RottenPitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rotten_pit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RottenPitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rotten_pit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RottenPitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rotten_pit.png");
	}
}
