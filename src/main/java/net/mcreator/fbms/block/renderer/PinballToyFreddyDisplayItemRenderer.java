package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PinballToyFreddyDisplayModel;
import net.mcreator.fbms.block.display.PinballToyFreddyDisplayItem;

public class PinballToyFreddyDisplayItemRenderer extends GeoItemRenderer<PinballToyFreddyDisplayItem> {
	public PinballToyFreddyDisplayItemRenderer() {
		super(new PinballToyFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinballToyFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
