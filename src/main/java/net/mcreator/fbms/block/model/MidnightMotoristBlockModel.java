package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MidnightMotoristTileEntity;

public class MidnightMotoristBlockModel extends GeoModel<MidnightMotoristTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MidnightMotoristTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/midnight_motorist.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MidnightMotoristTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/midnight_motorist.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MidnightMotoristTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/midnight_motorist.png");
	}
}
