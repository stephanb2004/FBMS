package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ScrapTrapDisplayItem;

public class ScrapTrapDisplayModel extends AnimatedGeoModel<ScrapTrapDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/blocks/scraptrap.png");
	}
}
