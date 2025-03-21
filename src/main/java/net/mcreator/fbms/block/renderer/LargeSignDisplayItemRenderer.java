package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSignDisplayModel;
import net.mcreator.fbms.block.display.LargeSignDisplayItem;

public class LargeSignDisplayItemRenderer extends GeoItemRenderer<LargeSignDisplayItem> {
	public LargeSignDisplayItemRenderer() {
		super(new LargeSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
