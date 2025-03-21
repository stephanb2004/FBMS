package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.WinkSignDisplayItem;

public class WinkSignDisplayModel extends GeoModel<WinkSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WinkSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fazbear_management_sim_winking_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WinkSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fazbear_management_sim_winking_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WinkSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/warning_sign.png");
	}
}
