package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WallyWalrusDisplayItem;

public class WallyWalrusDisplayModel extends AnimatedGeoModel<WallyWalrusDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WallyWalrusDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wallywalrus_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallyWalrusDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wallywalrus_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallyWalrusDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/wally_walrus.png");
	}
}
