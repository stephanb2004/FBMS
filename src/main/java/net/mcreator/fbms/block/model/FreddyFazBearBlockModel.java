package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FreddyFazBearTileEntity;

public class FreddyFazBearBlockModel extends AnimatedGeoModel<FreddyFazBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazBearTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/freddyv2.png");
	}
}
