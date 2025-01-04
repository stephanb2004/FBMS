package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ArcadeSignTileEntity;

public class ArcadeSignBlockModel extends AnimatedGeoModel<ArcadeSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeSignTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/wall_signs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeSignTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/wall_signs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeSignTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/arcadesign.png");
	}
}
