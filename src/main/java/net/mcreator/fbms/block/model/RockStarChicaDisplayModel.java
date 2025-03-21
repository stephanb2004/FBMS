package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarChicaDisplayItem;

public class RockStarChicaDisplayModel extends GeoModel<RockStarChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rchicablock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarChicaDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rchicablock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarChicaDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/rockstar_chica.png");
	}
}
