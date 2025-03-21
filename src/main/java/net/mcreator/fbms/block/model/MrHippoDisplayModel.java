package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MrHippoDisplayItem;

public class MrHippoDisplayModel extends GeoModel<MrHippoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/mrhippov2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/mrhippov2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/mrhippov2.png");
	}
}
