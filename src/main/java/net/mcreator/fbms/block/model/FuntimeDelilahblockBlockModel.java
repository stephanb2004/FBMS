package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FuntimeDelilahblockTileEntity;

public class FuntimeDelilahblockBlockModel extends GeoModel<FuntimeDelilahblockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahblockTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftdelilahv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahblockTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftdelilahv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahblockTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ftdelilahv2.png");
	}
}
