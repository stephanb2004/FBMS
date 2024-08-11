package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FtFoxyDisplayItem;

public class FtFoxyDisplayModel extends AnimatedGeoModel<FtFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FtFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ftfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FtFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ftfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FtFoxyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/ftfoxyv2.png");
	}
}
