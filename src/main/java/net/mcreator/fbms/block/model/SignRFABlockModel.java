package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SignRFATileEntity;

public class SignRFABlockModel extends AnimatedGeoModel<SignRFATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SignRFATileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignRFATileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignRFATileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_rfa.png");
	}
}
