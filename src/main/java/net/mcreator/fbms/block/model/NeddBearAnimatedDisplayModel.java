package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeddBearAnimatedDisplayItem;

public class NeddBearAnimatedDisplayModel extends AnimatedGeoModel<NeddBearAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neddbearanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neddbearanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neddbearv2.png");
	}
}
