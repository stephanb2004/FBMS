package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PuffyPuffinsAnimatedDisplayModel;
import net.mcreator.fbms.block.display.PuffyPuffinsAnimatedDisplayItem;

public class PuffyPuffinsAnimatedDisplayItemRenderer extends GeoItemRenderer<PuffyPuffinsAnimatedDisplayItem> {
	public PuffyPuffinsAnimatedDisplayItemRenderer() {
		super(new PuffyPuffinsAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PuffyPuffinsAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
