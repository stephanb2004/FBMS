package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BonkABonDisplayItem;

public class BonkABonDisplayModel extends GeoModel<BonkABonDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BonkABonDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/bonkabon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonkABonDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/bonkabon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonkABonDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/bonkabon.png");
	}
}
