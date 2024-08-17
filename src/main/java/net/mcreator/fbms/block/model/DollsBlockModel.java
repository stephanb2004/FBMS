package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DollsTileEntity;

public class DollsBlockModel extends AnimatedGeoModel<DollsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DollsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/docndtplush2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DollsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/docndtplush2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DollsTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/docndt.png");
	}
}
