package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SignMSTileEntity;

public class SignMSBlockModel extends AnimatedGeoModel<SignMSTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SignMSTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignMSTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignMSTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_ms.png");
	}
}
