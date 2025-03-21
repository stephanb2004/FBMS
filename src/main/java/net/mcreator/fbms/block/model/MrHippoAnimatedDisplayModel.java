package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MrHippoAnimatedDisplayItem;

public class MrHippoAnimatedDisplayModel extends GeoModel<MrHippoAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MrHippoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/mrhippoanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHippoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/mrhippoanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHippoAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/mrhippov2.png");
	}
}
