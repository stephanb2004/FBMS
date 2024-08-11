package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.MoltenFreddyTileEntity;

public class MoltenFreddyBlockModel extends AnimatedGeoModel<MoltenFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoltenFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/moltenblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenFreddyTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/moltenblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenFreddyTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/molten.png");
	}
}
