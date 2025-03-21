package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaPlaceSignOldDisplayModel;
import net.mcreator.fbms.block.display.PizzaPlaceSignOldDisplayItem;

public class PizzaPlaceSignOldDisplayItemRenderer extends GeoItemRenderer<PizzaPlaceSignOldDisplayItem> {
	public PizzaPlaceSignOldDisplayItemRenderer() {
		super(new PizzaPlaceSignOldDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaPlaceSignOldDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
