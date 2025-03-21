package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyBonnieDisplayModel;
import net.mcreator.fbms.block.display.ToyBonnieDisplayItem;

public class ToyBonnieDisplayItemRenderer extends GeoItemRenderer<ToyBonnieDisplayItem> {
	public ToyBonnieDisplayItemRenderer() {
		super(new ToyBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
