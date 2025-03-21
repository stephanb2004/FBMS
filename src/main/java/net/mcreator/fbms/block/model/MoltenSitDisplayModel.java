package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.MoltenSitDisplayItem;

public class MoltenSitDisplayModel extends GeoModel<MoltenSitDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MoltenSitDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/moltensit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenSitDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/moltensit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenSitDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/moltensit.png");
	}
}
