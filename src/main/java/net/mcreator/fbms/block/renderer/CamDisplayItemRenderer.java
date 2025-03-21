package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CamDisplayModel;
import net.mcreator.fbms.block.display.CamDisplayItem;

public class CamDisplayItemRenderer extends GeoItemRenderer<CamDisplayItem> {
	public CamDisplayItemRenderer() {
		super(new CamDisplayModel());
	}

	@Override
	public RenderType getRenderType(CamDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
