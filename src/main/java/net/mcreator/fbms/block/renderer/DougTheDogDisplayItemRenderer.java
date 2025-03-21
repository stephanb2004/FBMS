package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DougTheDogDisplayModel;
import net.mcreator.fbms.block.display.DougTheDogDisplayItem;

public class DougTheDogDisplayItemRenderer extends GeoItemRenderer<DougTheDogDisplayItem> {
	public DougTheDogDisplayItemRenderer() {
		super(new DougTheDogDisplayModel());
	}

	@Override
	public RenderType getRenderType(DougTheDogDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
