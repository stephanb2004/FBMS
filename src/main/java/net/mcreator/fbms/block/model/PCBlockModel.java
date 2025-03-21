package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PCTileEntity;

public class PCBlockModel extends GeoModel<PCTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PCTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/computer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PCTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/computer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PCTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/old_pc.png");
	}
}
