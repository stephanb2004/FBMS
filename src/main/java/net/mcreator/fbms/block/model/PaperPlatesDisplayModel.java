package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.PaperPlatesDisplayItem;

public class PaperPlatesDisplayModel extends GeoModel<PaperPlatesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PaperPlatesDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/paper_cups_and_plates.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PaperPlatesDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/paper_cups_and_plates.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PaperPlatesDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/papercupsandplates.png");
	}
}
