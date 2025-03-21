package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WitheredPuffyPuffinsDisplayModel;
import net.mcreator.fbms.block.display.WitheredPuffyPuffinsDisplayItem;

public class WitheredPuffyPuffinsDisplayItemRenderer extends GeoItemRenderer<WitheredPuffyPuffinsDisplayItem> {
	public WitheredPuffyPuffinsDisplayItemRenderer() {
		super(new WitheredPuffyPuffinsDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredPuffyPuffinsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
