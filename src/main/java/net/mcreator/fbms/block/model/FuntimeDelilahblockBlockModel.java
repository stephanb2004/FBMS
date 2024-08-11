package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FuntimeDelilahblockTileEntity;

public class FuntimeDelilahblockBlockModel extends AnimatedGeoModel<FuntimeDelilahblockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeDelilahblockTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftdelilahv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeDelilahblockTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftdelilahv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeDelilahblockTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/ftdelilahv2.png");
	}
}
