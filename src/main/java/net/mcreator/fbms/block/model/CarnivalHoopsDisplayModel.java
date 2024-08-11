package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.CarnivalHoopsDisplayItem;

public class CarnivalHoopsDisplayModel extends AnimatedGeoModel<CarnivalHoopsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarnivalHoopsDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/carnival_hoops.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarnivalHoopsDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/carnival_hoops.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarnivalHoopsDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/carnival_hoops.png");
	}
}
