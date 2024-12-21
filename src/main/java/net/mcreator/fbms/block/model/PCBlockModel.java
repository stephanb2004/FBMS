package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PCTileEntity;

public class PCBlockModel extends AnimatedGeoModel<PCTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PCTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/computer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PCTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/computer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PCTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/old_pc.png");
	}
}
