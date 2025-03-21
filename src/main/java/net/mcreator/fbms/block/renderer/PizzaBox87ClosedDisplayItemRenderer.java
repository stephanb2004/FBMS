package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox87ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox87ClosedDisplayItem;

public class PizzaBox87ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox87ClosedDisplayItem> {
	public PizzaBox87ClosedDisplayItemRenderer() {
		super(new PizzaBox87ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox87ClosedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
