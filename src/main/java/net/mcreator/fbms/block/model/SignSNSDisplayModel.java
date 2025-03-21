package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.SignSNSDisplayItem;

public class SignSNSDisplayModel extends GeoModel<SignSNSDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/block/sign_sns.png");
	}
}
