package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ElChipDisplayItem;

public class ElChipDisplayModel extends AnimatedGeoModel<ElChipDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ElChipDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/elchipblockv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/elchipblockv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/elchipv2.png");
	}
}
