package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SignSBTTileEntity;

public class SignSBTBlockModel extends AnimatedGeoModel<SignSBTTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SignSBTTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignSBTTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignSBTTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_sbt.png");
	}
}
