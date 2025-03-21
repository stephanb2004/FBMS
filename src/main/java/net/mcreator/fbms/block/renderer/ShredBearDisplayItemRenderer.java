package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ShredBearDisplayModel;
import net.mcreator.fbms.block.display.ShredBearDisplayItem;

public class ShredBearDisplayItemRenderer extends GeoItemRenderer<ShredBearDisplayItem> {
	public ShredBearDisplayItemRenderer() {
		super(new ShredBearDisplayModel());
	}

	@Override
	public RenderType getRenderType(ShredBearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
