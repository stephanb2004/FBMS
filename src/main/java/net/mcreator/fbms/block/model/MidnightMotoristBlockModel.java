package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MidnightMotoristTileEntity;

public class MidnightMotoristBlockModel extends AnimatedGeoModel<MidnightMotoristTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MidnightMotoristTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/midnight_motorist.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MidnightMotoristTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/midnight_motorist.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MidnightMotoristTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/midnight_motorist.png");
	}
}
