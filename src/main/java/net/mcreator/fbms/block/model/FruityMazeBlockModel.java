package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.FruityMazeTileEntity;

public class FruityMazeBlockModel extends AnimatedGeoModel<FruityMazeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FruityMazeTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/fruity_maze_arcade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FruityMazeTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/fruity_maze_arcade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FruityMazeTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/fruity_maze_arcade.png");
	}
}
