package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.IndigoTileEntity;

public class IndigoBlockModel extends GeoModel<IndigoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IndigoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndigoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndigoTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/indigo.png");
	}
}
