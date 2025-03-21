package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyFoxyDisplayModel;
import net.mcreator.fbms.block.display.ToyFoxyDisplayItem;

public class ToyFoxyDisplayItemRenderer extends GeoItemRenderer<ToyFoxyDisplayItem> {
	public ToyFoxyDisplayItemRenderer() {
		super(new ToyFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
