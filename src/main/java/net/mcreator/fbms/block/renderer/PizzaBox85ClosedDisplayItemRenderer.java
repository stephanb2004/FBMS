package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox85ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox85ClosedDisplayItem;

public class PizzaBox85ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox85ClosedDisplayItem> {
	public PizzaBox85ClosedDisplayItemRenderer() {
		super(new PizzaBox85ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox85ClosedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
