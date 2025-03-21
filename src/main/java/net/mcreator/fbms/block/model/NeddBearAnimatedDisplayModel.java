package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeddBearAnimatedDisplayItem;

public class NeddBearAnimatedDisplayModel extends GeoModel<NeddBearAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neddbearanimatedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neddbearanimatedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neddbearv2v2.png");
	}
}
