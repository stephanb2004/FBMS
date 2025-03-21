package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FredBearDisplayModel;
import net.mcreator.fbms.block.display.FredBearDisplayItem;

public class FredBearDisplayItemRenderer extends GeoItemRenderer<FredBearDisplayItem> {
	public FredBearDisplayItemRenderer() {
		super(new FredBearDisplayModel());
	}

	@Override
	public RenderType getRenderType(FredBearDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
