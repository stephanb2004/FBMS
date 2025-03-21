package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.NeddBearDisplayItem;

public class NeddBearDisplayModel extends GeoModel<NeddBearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeddBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/neddbearblockv2v2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeddBearDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/neddbearblockv2v2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeddBearDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/neddbearv2v2.png");
	}
}
