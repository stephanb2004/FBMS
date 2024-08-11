package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.PaperPlatesTileEntity;

public class PaperPlatesBlockModel extends AnimatedGeoModel<PaperPlatesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PaperPlatesTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/paper_cups_and_plates.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperPlatesTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/paper_cups_and_plates.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperPlatesTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/papercupsandplates.png");
	}
}
