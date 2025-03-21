package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PanStanTileEntity;

public class PanStanBlockModel extends GeoModel<PanStanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PanStanTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/pan_stan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PanStanTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/pan_stan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PanStanTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/panstan.png");
	}
}
