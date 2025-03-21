package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FuntimeDelilahTileEntity;

public class FuntimeDelilahBlockModel extends GeoModel<FuntimeDelilahTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftdelilahanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftdelilahanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ftdelilahv2.png");
	}
}
