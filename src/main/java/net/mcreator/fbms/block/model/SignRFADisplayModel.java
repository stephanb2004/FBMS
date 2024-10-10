package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SignRFADisplayItem;

public class SignRFADisplayModel extends AnimatedGeoModel<SignRFADisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SignRFADisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignRFADisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignRFADisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_rfa.png");
	}
}
