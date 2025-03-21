package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.EnhancedSpeakerSetDisplayItem;

public class EnhancedSpeakerSetDisplayModel extends GeoModel<EnhancedSpeakerSetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EnhancedSpeakerSetDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/enhanced_speaker_set.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnhancedSpeakerSetDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/enhanced_speaker_set.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnhancedSpeakerSetDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/enhanced_speaker_set.png");
	}
}
