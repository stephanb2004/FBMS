package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.HelpyCutOutDisplayItem;

public class HelpyCutOutDisplayModel extends GeoModel<HelpyCutOutDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HelpyCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HelpyCutOutDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HelpyCutOutDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/helpycutout.png");
	}
}
