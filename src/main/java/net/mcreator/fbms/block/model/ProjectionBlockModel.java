package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.ProjectionTileEntity;

public class ProjectionBlockModel extends GeoModel<ProjectionTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/projector_screen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/projector_screen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/projector_screen.png");
	}
}
