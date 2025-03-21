package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WinkSignDisplayModel;
import net.mcreator.fbms.block.display.WinkSignDisplayItem;

public class WinkSignDisplayItemRenderer extends GeoItemRenderer<WinkSignDisplayItem> {
	public WinkSignDisplayItemRenderer() {
		super(new WinkSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(WinkSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
