package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeddBearTileEntity;

public class NeddBearBlockModel extends AnimatedGeoModel<NeddBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neddbearblockv2v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neddbearblockv2v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neddbearv2v2.png");
	}
}
