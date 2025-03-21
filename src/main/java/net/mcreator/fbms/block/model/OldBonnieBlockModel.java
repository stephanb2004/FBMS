package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OldBonnieTileEntity;

public class OldBonnieBlockModel extends GeoModel<OldBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dinerbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dinerbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldBonnieTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/dinerbonnie.png");
	}
}
