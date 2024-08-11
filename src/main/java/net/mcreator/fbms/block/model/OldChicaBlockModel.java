package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OldChicaTileEntity;

public class OldChicaBlockModel extends AnimatedGeoModel<OldChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dinerchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dinerchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldChicaTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/dinerchica.png");
	}
}
