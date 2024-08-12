package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PigPatchDisplayItem;

public class PigPatchDisplayModel extends AnimatedGeoModel<PigPatchDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PigPatchDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pigpatchv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PigPatchDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pigpatchv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PigPatchDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/pigpatchv2v2.png");
	}
}
