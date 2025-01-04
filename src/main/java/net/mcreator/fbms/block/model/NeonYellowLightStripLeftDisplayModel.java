package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonYellowLightStripLeftDisplayItem;

public class NeonYellowLightStripLeftDisplayModel extends AnimatedGeoModel<NeonYellowLightStripLeftDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/blocks/neonyellowleft.png");
	}
}
