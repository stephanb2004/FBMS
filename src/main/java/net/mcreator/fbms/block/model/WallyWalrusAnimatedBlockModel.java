package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WallyWalrusAnimatedTileEntity;

public class WallyWalrusAnimatedBlockModel extends AnimatedGeoModel<WallyWalrusAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WallyWalrusAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wallywalrus_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallyWalrusAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wallywalrus_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallyWalrusAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/wally_walrus.png");
	}
}
