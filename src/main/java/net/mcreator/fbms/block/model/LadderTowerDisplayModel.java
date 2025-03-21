package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LadderTowerDisplayItem;

public class LadderTowerDisplayModel extends GeoModel<LadderTowerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LadderTowerDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/ladder_tower.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LadderTowerDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/ladder_tower.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LadderTowerDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/laddertower.png");
	}
}
