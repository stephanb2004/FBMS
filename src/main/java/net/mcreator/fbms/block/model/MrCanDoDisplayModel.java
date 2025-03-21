package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MrCanDoDisplayItem;

public class MrCanDoDisplayModel extends GeoModel<MrCanDoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MrCanDoDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/mrcando.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrCanDoDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/mrcando.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrCanDoDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/mr._can-do.png");
	}
}
