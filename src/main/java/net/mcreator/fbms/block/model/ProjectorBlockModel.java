package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ProjectorTileEntity;

public class ProjectorBlockModel extends AnimatedGeoModel<ProjectorTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectorTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectorTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectorTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/projector.png");
	}
}
