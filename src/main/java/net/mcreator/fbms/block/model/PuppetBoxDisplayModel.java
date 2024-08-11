package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PuppetBoxDisplayItem;

public class PuppetBoxDisplayModel extends AnimatedGeoModel<PuppetBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PuppetBoxDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuppetBoxDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuppetBoxDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/box_1.png");
	}
}
