package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MrHippoAnimatedTileEntity;

public class MrHippoAnimatedBlockModel extends GeoModel<MrHippoAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mrhippoanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mrhippoanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/mrhippov2.png");
	}
}
