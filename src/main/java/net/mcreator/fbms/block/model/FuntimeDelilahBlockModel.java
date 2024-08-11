package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FuntimeDelilahTileEntity;

public class FuntimeDelilahBlockModel extends AnimatedGeoModel<FuntimeDelilahTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftdelilahanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftdelilahanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/ftdelilahv2.png");
	}
}
