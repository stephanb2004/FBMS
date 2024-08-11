package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DrTeathTileEntity;

public class DrTeathBlockModel extends AnimatedGeoModel<DrTeathTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DrTeathTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/drteeth.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DrTeathTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/drteeth.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DrTeathTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/ce1752722ffa8ee475268bbcf59d105027539643.png");
	}
}
