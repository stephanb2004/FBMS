package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.TheMangleDisplayItem;

public class TheMangleDisplayModel extends AnimatedGeoModel<TheMangleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TheMangleDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheMangleDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheMangleDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/obhf_mangle.png");
	}
}
