package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MoltenFreddyDisplayItem;

public class MoltenFreddyDisplayModel extends AnimatedGeoModel<MoltenFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MoltenFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/moltenblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/moltenblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/molten.png");
	}
}
