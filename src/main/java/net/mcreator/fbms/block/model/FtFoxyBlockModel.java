package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FtFoxyTileEntity;

public class FtFoxyBlockModel extends GeoModel<FtFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FtFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FtFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FtFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ftfoxy.png");
	}
}
