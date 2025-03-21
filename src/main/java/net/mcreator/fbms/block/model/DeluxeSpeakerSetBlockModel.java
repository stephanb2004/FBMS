package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.DeluxeSpeakerSetTileEntity;

public class DeluxeSpeakerSetBlockModel extends GeoModel<DeluxeSpeakerSetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeSpeakerSetTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/deluxe_speaker_set.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeSpeakerSetTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/deluxe_speaker_set.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeSpeakerSetTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/deluxe_speaker_set.png");
	}
}
