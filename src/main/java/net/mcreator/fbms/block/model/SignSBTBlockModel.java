package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SignSBTTileEntity;

public class SignSBTBlockModel extends GeoModel<SignSBTTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SignSBTTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignSBTTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignSBTTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/sign_sbt.png");
	}
}
