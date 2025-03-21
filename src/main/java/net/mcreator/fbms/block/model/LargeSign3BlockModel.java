package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.LargeSign3TileEntity;

public class LargeSign3BlockModel extends GeoModel<LargeSign3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeSign3TileEntity animatable) {
		return new ResourceLocation("fbms", "animations/sign3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeSign3TileEntity animatable) {
		return new ResourceLocation("fbms", "geo/sign3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeSign3TileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/nightshift_promospringtrap.png");
	}
}
