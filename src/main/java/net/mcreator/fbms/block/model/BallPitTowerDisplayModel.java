package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BallPitTowerDisplayItem;

public class BallPitTowerDisplayModel extends AnimatedGeoModel<BallPitTowerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BallPitTowerDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ballpittower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallPitTowerDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ballpittower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallPitTowerDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/ballpittower.png");
	}
}