package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonYellowLightStripLeftDisplayItem;

public class NeonYellowLightStripLeftDisplayModel extends GeoModel<NeonYellowLightStripLeftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonYellowLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonYellowLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonYellowLightStripLeftDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neonyellowleft.png");
	}
}
