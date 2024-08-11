package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WinkSignTileEntity;

public class WinkSignBlockModel extends AnimatedGeoModel<WinkSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WinkSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fazbear_management_sim_winking_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WinkSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fazbear_management_sim_winking_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WinkSignTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/warning_sign.png");
	}
}
