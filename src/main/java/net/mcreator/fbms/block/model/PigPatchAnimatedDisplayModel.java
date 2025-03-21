package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PigPatchAnimatedDisplayItem;

public class PigPatchAnimatedDisplayModel extends GeoModel<PigPatchAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PigPatchAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/pigpatchanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PigPatchAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/pigpatchanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PigPatchAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/pigpatchv2v2.png");
	}
}
