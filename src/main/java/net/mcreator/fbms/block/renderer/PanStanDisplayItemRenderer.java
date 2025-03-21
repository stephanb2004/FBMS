package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PanStanDisplayModel;
import net.mcreator.fbms.block.display.PanStanDisplayItem;

public class PanStanDisplayItemRenderer extends GeoItemRenderer<PanStanDisplayItem> {
	public PanStanDisplayItemRenderer() {
		super(new PanStanDisplayModel());
	}

	@Override
	public RenderType getRenderType(PanStanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
