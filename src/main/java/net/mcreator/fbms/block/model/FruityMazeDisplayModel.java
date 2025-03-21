package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FruityMazeDisplayItem;

public class FruityMazeDisplayModel extends GeoModel<FruityMazeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FruityMazeDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/fruity_maze_arcade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FruityMazeDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/fruity_maze_arcade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FruityMazeDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/fruity_maze_arcade.png");
	}
}
