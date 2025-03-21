package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WallyWalrusAnimatedDisplayItem;

public class WallyWalrusAnimatedDisplayModel extends GeoModel<WallyWalrusAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WallyWalrusAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/wallywalrus_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallyWalrusAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/wallywalrus_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallyWalrusAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/wally_walrus.png");
	}
}
