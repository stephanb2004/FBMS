package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OldFoxyTileEntity;

public class OldFoxyBlockModel extends AnimatedGeoModel<OldFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dinerfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldFoxyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dinerfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldFoxyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/dinerfoxy.png");
	}
}
