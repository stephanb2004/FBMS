package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.CeilingStageLightpinkTileEntity;

public class CeilingStageLightpinkBlockModel extends GeoModel<CeilingStageLightpinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightpinkTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightpinkTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightpinkTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_pink.png");
	}
}
