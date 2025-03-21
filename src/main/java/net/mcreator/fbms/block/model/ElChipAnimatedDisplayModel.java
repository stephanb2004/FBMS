package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ElChipAnimatedDisplayItem;

public class ElChipAnimatedDisplayModel extends GeoModel<ElChipAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ElChipAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/elchipanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ElChipAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/elchipanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ElChipAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/elchipv2.png");
	}
}
