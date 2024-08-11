package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BiteFredBearCutoutDisplayItem;

public class BiteFredBearCutoutDisplayModel extends AnimatedGeoModel<BiteFredBearCutoutDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BiteFredBearCutoutDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fredbearbiteblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BiteFredBearCutoutDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fredbearbiteblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BiteFredBearCutoutDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fredbear.png");
	}
}
