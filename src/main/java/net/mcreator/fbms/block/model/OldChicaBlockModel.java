package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.OldChicaTileEntity;

public class OldChicaBlockModel extends GeoModel<OldChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(OldChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/dinerchica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OldChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/dinerchica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OldChicaTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/dinerchica.png");
	}
}
