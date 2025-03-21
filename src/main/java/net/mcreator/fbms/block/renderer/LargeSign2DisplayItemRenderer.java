package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign2DisplayModel;
import net.mcreator.fbms.block.display.LargeSign2DisplayItem;

public class LargeSign2DisplayItemRenderer extends GeoItemRenderer<LargeSign2DisplayItem> {
	public LargeSign2DisplayItemRenderer() {
		super(new LargeSign2DisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeSign2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
