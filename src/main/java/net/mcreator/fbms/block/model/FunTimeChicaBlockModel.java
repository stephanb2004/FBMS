package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FunTimeChicaTileEntity;

public class FunTimeChicaBlockModel extends GeoModel<FunTimeChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FunTimeChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ftchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FunTimeChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ftchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FunTimeChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/ftchica.png");
	}
}
