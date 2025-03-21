package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PuffyPuffinsDisplayModel;
import net.mcreator.fbms.block.display.PuffyPuffinsDisplayItem;

public class PuffyPuffinsDisplayItemRenderer extends GeoItemRenderer<PuffyPuffinsDisplayItem> {
	public PuffyPuffinsDisplayItemRenderer() {
		super(new PuffyPuffinsDisplayModel());
	}

	@Override
	public RenderType getRenderType(PuffyPuffinsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
