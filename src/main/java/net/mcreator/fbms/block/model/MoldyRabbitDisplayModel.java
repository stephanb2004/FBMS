package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MoldyRabbitDisplayItem;

public class MoldyRabbitDisplayModel extends GeoModel<MoldyRabbitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MoldyRabbitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/moldyrabit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoldyRabbitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/moldyrabit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoldyRabbitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/springbonnie.png");
	}
}
