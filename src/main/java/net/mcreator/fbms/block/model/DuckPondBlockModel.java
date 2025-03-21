package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DuckPondTileEntity;

public class DuckPondBlockModel extends GeoModel<DuckPondTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DuckPondTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/duck_pond.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DuckPondTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/duck_pond.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DuckPondTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/helpysoffice.png");
	}
}
