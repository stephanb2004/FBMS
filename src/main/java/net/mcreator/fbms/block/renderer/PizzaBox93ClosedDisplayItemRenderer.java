package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox93ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox93ClosedDisplayItem;

public class PizzaBox93ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox93ClosedDisplayItem> {
	public PizzaBox93ClosedDisplayItemRenderer() {
		super(new PizzaBox93ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox93ClosedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
