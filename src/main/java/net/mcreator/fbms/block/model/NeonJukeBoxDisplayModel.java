package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonJukeBoxDisplayItem;

public class NeonJukeBoxDisplayModel extends AnimatedGeoModel<NeonJukeBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonJukeBoxDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neonjukeboxa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonJukeBoxDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neonjukeboxa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonJukeBoxDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neon_jukebox_a.png");
	}
}
