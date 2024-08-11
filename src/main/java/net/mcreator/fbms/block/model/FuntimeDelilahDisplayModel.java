package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FuntimeDelilahDisplayItem;

public class FuntimeDelilahDisplayModel extends AnimatedGeoModel<FuntimeDelilahDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ftdelilahanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ftdelilahanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/ftdelilahv2.png");
	}
}
