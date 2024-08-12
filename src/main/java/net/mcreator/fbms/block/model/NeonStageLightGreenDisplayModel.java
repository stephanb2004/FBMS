package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeonStageLightGreenDisplayItem;

public class NeonStageLightGreenDisplayModel extends AnimatedGeoModel<NeonStageLightGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightGreenDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/paper_cups_and_plates.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightGreenDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/paper_cups_and_plates.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightGreenDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/papercupsandplates.png");
	}
}
