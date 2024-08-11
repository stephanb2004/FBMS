package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BonnetDisplayItem;

public class BonnetDisplayModel extends AnimatedGeoModel<BonnetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonnetDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnetDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnetDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/bonnet.png");
	}
}
