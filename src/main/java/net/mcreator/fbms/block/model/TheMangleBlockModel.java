package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.TheMangleTileEntity;

public class TheMangleBlockModel extends GeoModel<TheMangleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheMangleTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheMangleTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheMangleTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/obhf_mangle.png");
	}
}
