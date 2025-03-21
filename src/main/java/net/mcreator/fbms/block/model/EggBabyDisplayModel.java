package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.EggBabyDisplayItem;

public class EggBabyDisplayModel extends GeoModel<EggBabyDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/block/fms_egg_baby.png");
	}
}
