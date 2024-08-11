package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LolBit409TileEntity;

public class LolBit409BlockModel extends AnimatedGeoModel<LolBit409TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LolBit409TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/oldlolbit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LolBit409TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/oldlolbit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LolBit409TileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/lolbitold.png");
	}
}
