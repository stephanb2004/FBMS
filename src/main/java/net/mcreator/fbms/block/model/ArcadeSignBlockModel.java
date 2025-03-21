package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ArcadeSignTileEntity;

public class ArcadeSignBlockModel extends GeoModel<ArcadeSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeSignTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/arcadesign.png");
	}
}
