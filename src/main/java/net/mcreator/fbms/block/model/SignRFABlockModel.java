package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SignRFATileEntity;

public class SignRFABlockModel extends GeoModel<SignRFATileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SignRFATileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignRFATileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignRFATileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/sign_rfa.png");
	}
}
