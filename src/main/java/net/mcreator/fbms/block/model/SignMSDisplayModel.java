package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SignMSDisplayItem;

public class SignMSDisplayModel extends AnimatedGeoModel<SignMSDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SignMSDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignMSDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignMSDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_ms.png");
	}
}
