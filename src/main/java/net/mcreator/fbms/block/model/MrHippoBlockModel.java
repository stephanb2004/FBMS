package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MrHippoTileEntity;

public class MrHippoBlockModel extends GeoModel<MrHippoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/mrhippov2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/mrhippov2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/mrhippov2.png");
	}
}
