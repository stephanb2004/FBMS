package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BrokenBonnieTileEntity;

public class BrokenBonnieBlockModel extends GeoModel<BrokenBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bonniebroken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bonniebroken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/bonniebroken.png");
	}
}
