package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox24OpenDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox24OpenDisplayItem;

public class PizzaBox24OpenDisplayItemRenderer extends GeoItemRenderer<PizzaBox24OpenDisplayItem> {
	public PizzaBox24OpenDisplayItemRenderer() {
		super(new PizzaBox24OpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox24OpenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
