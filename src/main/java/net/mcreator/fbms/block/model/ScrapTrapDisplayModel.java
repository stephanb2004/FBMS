package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ScrapTrapDisplayItem;

public class ScrapTrapDisplayModel extends GeoModel<ScrapTrapDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ScrapTrapDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/scraptrapblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapTrapDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/scraptrapblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapTrapDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/scraptrap.png");
	}
}
