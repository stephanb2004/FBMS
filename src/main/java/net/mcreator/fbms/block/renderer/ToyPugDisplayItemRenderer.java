package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyPugDisplayModel;
import net.mcreator.fbms.block.display.ToyPugDisplayItem;

public class ToyPugDisplayItemRenderer extends GeoItemRenderer<ToyPugDisplayItem> {
	public ToyPugDisplayItemRenderer() {
		super(new ToyPugDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyPugDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
