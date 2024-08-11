package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MrCanDoTileEntity;

public class MrCanDoBlockModel extends AnimatedGeoModel<MrCanDoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrCanDoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mrcando.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrCanDoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mrcando.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrCanDoTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/mr._can-do.png");
	}
}
