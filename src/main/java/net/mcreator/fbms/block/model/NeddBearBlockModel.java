package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeddBearTileEntity;

public class NeddBearBlockModel extends AnimatedGeoModel<NeddBearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/neddbearv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/neddbearv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/neddbearv2.png");
	}
}
