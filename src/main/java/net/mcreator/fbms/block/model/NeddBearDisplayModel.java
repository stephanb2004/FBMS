package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeddBearDisplayItem;

public class NeddBearDisplayModel extends AnimatedGeoModel<NeddBearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neddbearv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neddbearv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/neddbearv2.png");
	}
}
