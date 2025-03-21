package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ProjectorDisplayItem;

public class ProjectorDisplayModel extends GeoModel<ProjectorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProjectorDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectorDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectorDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/projector.png");
	}
}
