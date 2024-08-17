package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WitheredWallyWalrusDisplayItem;

public class WitheredWallyWalrusDisplayModel extends AnimatedGeoModel<WitheredWallyWalrusDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredWallyWalrusDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/withered_wallywalrus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredWallyWalrusDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/withered_wallywalrus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredWallyWalrusDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/wally_walrus_withered.png");
	}
}
