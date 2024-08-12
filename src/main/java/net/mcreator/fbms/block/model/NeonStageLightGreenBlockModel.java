package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.NeonStageLightGreenTileEntity;

public class NeonStageLightGreenBlockModel extends AnimatedGeoModel<NeonStageLightGreenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightGreenTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/paper_cups_and_plates.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightGreenTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/paper_cups_and_plates.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightGreenTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/papercupsandplates.png");
	}
}
