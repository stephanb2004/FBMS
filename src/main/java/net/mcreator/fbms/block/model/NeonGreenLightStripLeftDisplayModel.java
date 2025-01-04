package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonGreenLightStripLeftDisplayItem;

public class NeonGreenLightStripLeftDisplayModel extends AnimatedGeoModel<NeonGreenLightStripLeftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonGreenLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_stripes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonGreenLightStripLeftDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_stripes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonGreenLightStripLeftDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neongreenlightstipfix.png");
	}
}
