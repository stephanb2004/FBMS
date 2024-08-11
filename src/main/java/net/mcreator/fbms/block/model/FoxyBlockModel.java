package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FoxyTileEntity;

public class FoxyBlockModel extends AnimatedGeoModel<FoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/foxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/foxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/foxyv2.png");
	}
}
