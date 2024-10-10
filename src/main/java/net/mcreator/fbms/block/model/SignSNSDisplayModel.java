package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SignSNSDisplayItem;

public class SignSNSDisplayModel extends AnimatedGeoModel<SignSNSDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SignSNSDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignSNSDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignSNSDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_sns.png");
	}
}
