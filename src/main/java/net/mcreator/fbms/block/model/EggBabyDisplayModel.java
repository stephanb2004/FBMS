package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.EggBabyDisplayItem;

public class EggBabyDisplayModel extends AnimatedGeoModel<EggBabyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EggBabyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fmseggbaby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EggBabyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fmseggbaby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EggBabyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/fms_egg_baby.png");
	}
}
