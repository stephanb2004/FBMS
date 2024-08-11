package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.SanitationStationTileEntity;

public class SanitationStationBlockModel extends AnimatedGeoModel<SanitationStationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SanitationStationTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fmssanitationstation.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SanitationStationTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fmssanitationstation.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SanitationStationTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fmssanitationstation.png");
	}
}
