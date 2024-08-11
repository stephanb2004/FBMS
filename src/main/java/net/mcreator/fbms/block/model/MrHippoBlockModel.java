package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MrHippoTileEntity;

public class MrHippoBlockModel extends AnimatedGeoModel<MrHippoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mrhippov2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mrhippov2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/mrhippov2.png");
	}
}
