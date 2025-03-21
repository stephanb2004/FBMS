package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CeilingStageLightpinkDisplayItem;

public class CeilingStageLightpinkDisplayModel extends GeoModel<CeilingStageLightpinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CeilingStageLightpinkDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ceiling_stage_lights.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CeilingStageLightpinkDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ceiling_stage_lights.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CeilingStageLightpinkDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neon_stage_light_pink.png");
	}
}
