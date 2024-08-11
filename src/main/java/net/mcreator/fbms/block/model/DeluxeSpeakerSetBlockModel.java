package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DeluxeSpeakerSetTileEntity;

public class DeluxeSpeakerSetBlockModel extends AnimatedGeoModel<DeluxeSpeakerSetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeSpeakerSetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/deluxe_speaker_set.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeSpeakerSetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/deluxe_speaker_set.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeSpeakerSetTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/deluxe_speaker_set.png");
	}
}
