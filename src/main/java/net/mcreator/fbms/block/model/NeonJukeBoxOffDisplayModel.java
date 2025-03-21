package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonJukeBoxOffDisplayItem;

public class NeonJukeBoxOffDisplayModel extends GeoModel<NeonJukeBoxOffDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonJukeBoxOffDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neon_jukebox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonJukeBoxOffDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neon_jukebox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonJukeBoxOffDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neon_jukebox.png");
	}
}
