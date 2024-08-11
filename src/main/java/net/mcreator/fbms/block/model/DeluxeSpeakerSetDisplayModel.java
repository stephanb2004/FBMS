package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DeluxeSpeakerSetDisplayItem;

public class DeluxeSpeakerSetDisplayModel extends AnimatedGeoModel<DeluxeSpeakerSetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeSpeakerSetDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/deluxe_speaker_set.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeSpeakerSetDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/deluxe_speaker_set.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeSpeakerSetDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/deluxe_speaker_set.png");
	}
}
