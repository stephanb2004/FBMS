package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.Number1CrateTileEntity;

public class Number1CrateBlockModel extends GeoModel<Number1CrateTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Number1CrateTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/numberonecrate.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Number1CrateTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/numberonecrate.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Number1CrateTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/1_crate.png");
	}
}
