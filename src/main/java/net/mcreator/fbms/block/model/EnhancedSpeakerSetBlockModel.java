package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.EnhancedSpeakerSetTileEntity;

public class EnhancedSpeakerSetBlockModel extends AnimatedGeoModel<EnhancedSpeakerSetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(EnhancedSpeakerSetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/enhanced_speaker_set.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EnhancedSpeakerSetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/enhanced_speaker_set.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EnhancedSpeakerSetTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/enhanced_speaker_set.png");
	}
}
