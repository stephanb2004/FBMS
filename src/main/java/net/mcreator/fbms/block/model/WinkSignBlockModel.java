package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.WinkSignTileEntity;

public class WinkSignBlockModel extends GeoModel<WinkSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WinkSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fazbear_management_sim_winking_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WinkSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fazbear_management_sim_winking_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WinkSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/warning_sign.png");
	}
}
