package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BonBonDisplayItem;

public class BonBonDisplayModel extends AnimatedGeoModel<BonBonDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonBonDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonBonDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonBonDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/bonbon.png");
	}
}
