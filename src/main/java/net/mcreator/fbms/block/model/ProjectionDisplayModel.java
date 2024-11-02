package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ProjectionDisplayItem;

public class ProjectionDisplayModel extends AnimatedGeoModel<ProjectionDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProjectionDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/projector_screen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectionDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/projector_screen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectionDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/projector_screen.png");
	}
}
