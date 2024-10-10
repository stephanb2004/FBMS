package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SignDDWDisplayItem;

public class SignDDWDisplayModel extends AnimatedGeoModel<SignDDWDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SignDDWDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignDDWDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignDDWDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_ddw.png");
	}
}
