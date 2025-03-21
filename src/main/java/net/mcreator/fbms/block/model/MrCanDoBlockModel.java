package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MrCanDoTileEntity;

public class MrCanDoBlockModel extends GeoModel<MrCanDoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrCanDoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mrcando.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrCanDoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mrcando.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrCanDoTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/mr._can-do.png");
	}
}
