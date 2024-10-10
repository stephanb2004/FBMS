package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SignSBTDisplayItem;

public class SignSBTDisplayModel extends AnimatedGeoModel<SignSBTDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SignSBTDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/freby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SignSBTDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/freby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SignSBTDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/sign_sbt.png");
	}
}
