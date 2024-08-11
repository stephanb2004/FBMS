package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LargeSign3DisplayItem;

public class LargeSign3DisplayModel extends AnimatedGeoModel<LargeSign3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LargeSign3DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/sign3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSign3DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/sign3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSign3DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/nightshift_promospringtrap.png");
	}
}
