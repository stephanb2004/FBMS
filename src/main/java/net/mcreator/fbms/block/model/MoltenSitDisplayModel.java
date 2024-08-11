package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MoltenSitDisplayItem;

public class MoltenSitDisplayModel extends AnimatedGeoModel<MoltenSitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MoltenSitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/moltenv2sit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenSitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/moltenv2sit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenSitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/moltenv2.png");
	}
}
