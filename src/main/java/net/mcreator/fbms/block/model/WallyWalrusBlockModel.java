package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WallyWalrusTileEntity;

public class WallyWalrusBlockModel extends GeoModel<WallyWalrusTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WallyWalrusTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wallywalrus_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallyWalrusTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wallywalrus_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallyWalrusTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/wally_walrus.png");
	}
}
