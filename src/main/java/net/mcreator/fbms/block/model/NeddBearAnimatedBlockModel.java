package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeddBearAnimatedTileEntity;

public class NeddBearAnimatedBlockModel extends AnimatedGeoModel<NeddBearAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neddbearanimatedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neddbearanimatedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neddbearv2v2.png");
	}
}
