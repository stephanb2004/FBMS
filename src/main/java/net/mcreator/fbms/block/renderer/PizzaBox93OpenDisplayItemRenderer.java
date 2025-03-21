package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox93OpenDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox93OpenDisplayItem;

public class PizzaBox93OpenDisplayItemRenderer extends GeoItemRenderer<PizzaBox93OpenDisplayItem> {
	public PizzaBox93OpenDisplayItemRenderer() {
		super(new PizzaBox93OpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox93OpenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
