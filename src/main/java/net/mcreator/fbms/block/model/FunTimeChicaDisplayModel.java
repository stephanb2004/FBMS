package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FunTimeChicaDisplayItem;

public class FunTimeChicaDisplayModel extends GeoModel<FunTimeChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FunTimeChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ftchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FunTimeChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ftchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FunTimeChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/ftchica.png");
	}
}
