package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ElChipAnimatedDisplayItem;

public class ElChipAnimatedDisplayModel extends AnimatedGeoModel<ElChipAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ElChipAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/elchipanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/elchipanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/elchipv2.png");
	}
}
