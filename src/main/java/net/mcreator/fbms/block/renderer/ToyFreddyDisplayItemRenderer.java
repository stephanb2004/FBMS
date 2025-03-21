package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyFreddyDisplayModel;
import net.mcreator.fbms.block.display.ToyFreddyDisplayItem;

public class ToyFreddyDisplayItemRenderer extends GeoItemRenderer<ToyFreddyDisplayItem> {
	public ToyFreddyDisplayItemRenderer() {
		super(new ToyFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
