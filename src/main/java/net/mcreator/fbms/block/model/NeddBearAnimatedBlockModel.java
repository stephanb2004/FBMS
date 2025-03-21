package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeddBearAnimatedTileEntity;

public class NeddBearAnimatedBlockModel extends GeoModel<NeddBearAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neddbearanimatedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neddbearanimatedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neddbearv2v2.png");
	}
}
