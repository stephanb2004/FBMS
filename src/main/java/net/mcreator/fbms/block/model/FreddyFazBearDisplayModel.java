package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FreddyFazBearDisplayItem;

public class FreddyFazBearDisplayModel extends AnimatedGeoModel<FreddyFazBearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazBearDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/freddyv2.png");
	}
}