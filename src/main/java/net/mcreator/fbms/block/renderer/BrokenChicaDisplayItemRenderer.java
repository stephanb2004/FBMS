package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BrokenChicaDisplayModel;
import net.mcreator.fbms.block.display.BrokenChicaDisplayItem;

public class BrokenChicaDisplayItemRenderer extends GeoItemRenderer<BrokenChicaDisplayItem> {
	public BrokenChicaDisplayItemRenderer() {
		super(new BrokenChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(BrokenChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
