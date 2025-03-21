package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaPlaceSignDisplayModel;
import net.mcreator.fbms.block.display.PizzaPlaceSignDisplayItem;

public class PizzaPlaceSignDisplayItemRenderer extends GeoItemRenderer<PizzaPlaceSignDisplayItem> {
	public PizzaPlaceSignDisplayItemRenderer() {
		super(new PizzaPlaceSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaPlaceSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
