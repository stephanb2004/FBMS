package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SignSNSTileEntity;

public class SignSNSBlockModel extends AnimatedGeoModel<SignSNSTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SignSNSTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignSNSTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignSNSTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_sns.png");
	}
}
