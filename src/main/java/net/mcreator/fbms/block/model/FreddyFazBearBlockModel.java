package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FreddyFazBearTileEntity;

public class FreddyFazBearBlockModel extends GeoModel<FreddyFazBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/freddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/freddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazBearTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/freddyv2.png");
	}
}
