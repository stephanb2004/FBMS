package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Springbonnie01DisplayItem;

public class Springbonnie01DisplayModel extends GeoModel<Springbonnie01DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Springbonnie01DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/01_springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Springbonnie01DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/01_springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Springbonnie01DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/01_springbonnie.png");
	}
}
