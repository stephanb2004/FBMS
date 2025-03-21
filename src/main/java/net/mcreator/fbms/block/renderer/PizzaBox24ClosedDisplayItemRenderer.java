package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox24ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox24ClosedDisplayItem;

public class PizzaBox24ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox24ClosedDisplayItem> {
	public PizzaBox24ClosedDisplayItemRenderer() {
		super(new PizzaBox24ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox24ClosedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
