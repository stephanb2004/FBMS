package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GusThePugDisplayModel;
import net.mcreator.fbms.block.display.GusThePugDisplayItem;

public class GusThePugDisplayItemRenderer extends GeoItemRenderer<GusThePugDisplayItem> {
	public GusThePugDisplayItemRenderer() {
		super(new GusThePugDisplayModel());
	}

	@Override
	public RenderType getRenderType(GusThePugDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
