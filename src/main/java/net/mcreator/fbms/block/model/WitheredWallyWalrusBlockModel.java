package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WitheredWallyWalrusTileEntity;

public class WitheredWallyWalrusBlockModel extends GeoModel<WitheredWallyWalrusTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredWallyWalrusTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/withered_wallywalrus.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredWallyWalrusTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/withered_wallywalrus.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredWallyWalrusTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/wally_walrus_withered.png");
	}
}
