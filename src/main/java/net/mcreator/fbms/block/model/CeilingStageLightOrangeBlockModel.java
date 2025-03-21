package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CeilingStageLightOrangeTileEntity;

public class CeilingStageLightOrangeBlockModel extends GeoModel<CeilingStageLightOrangeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightOrangeTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightOrangeTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightOrangeTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_orange.png");
	}
}
