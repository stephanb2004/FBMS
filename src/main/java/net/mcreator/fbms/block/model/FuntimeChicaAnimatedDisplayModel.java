package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FuntimeChicaAnimatedDisplayItem;

public class FuntimeChicaAnimatedDisplayModel extends GeoModel<FuntimeChicaAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeChicaAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ftchicaa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeChicaAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ftchicaa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeChicaAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/ftchica.png");
	}
}
