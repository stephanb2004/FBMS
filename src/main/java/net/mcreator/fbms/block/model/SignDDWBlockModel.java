package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SignDDWTileEntity;

public class SignDDWBlockModel extends GeoModel<SignDDWTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SignDDWTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignDDWTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignDDWTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/sign_ddw.png");
	}
}
