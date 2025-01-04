package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FredbearDeactivatedTileEntity;

public class FredbearDeactivatedBlockModel extends AnimatedGeoModel<FredbearDeactivatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FredbearDeactivatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fredbearsit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FredbearDeactivatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fredbearsit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FredbearDeactivatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fredbeara.png");
	}
}
