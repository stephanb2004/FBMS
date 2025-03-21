package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CeilingStageLightOrangeDisplayItem;

public class CeilingStageLightOrangeDisplayModel extends GeoModel<CeilingStageLightOrangeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightOrangeDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightOrangeDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightOrangeDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_orange.png");
	}
}
