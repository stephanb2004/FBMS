package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox85OpenDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox85OpenDisplayItem;

public class PizzaBox85OpenDisplayItemRenderer extends GeoItemRenderer<PizzaBox85OpenDisplayItem> {
	public PizzaBox85OpenDisplayItemRenderer() {
		super(new PizzaBox85OpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox85OpenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
