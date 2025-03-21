package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PuffyPuffinsTileEntity;

public class PuffyPuffinsBlockModel extends GeoModel<PuffyPuffinsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PuffyPuffinsTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/puffypuffins_idle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PuffyPuffinsTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/puffypuffins_idle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PuffyPuffinsTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/puffy_puffins.png");
	}
}
