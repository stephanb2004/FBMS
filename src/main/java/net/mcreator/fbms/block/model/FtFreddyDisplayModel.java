package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FtFreddyDisplayItem;

public class FtFreddyDisplayModel extends AnimatedGeoModel<FtFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FtFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ftfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FtFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ftfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FtFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/ftfreddy.png");
	}
}
