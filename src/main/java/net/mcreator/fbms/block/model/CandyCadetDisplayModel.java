package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CandyCadetDisplayItem;

public class CandyCadetDisplayModel extends AnimatedGeoModel<CandyCadetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CandyCadetDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/candycadetblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCadetDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/candycadetblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCadetDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/candycadet.png");
	}
}