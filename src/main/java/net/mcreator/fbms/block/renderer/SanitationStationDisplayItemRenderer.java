package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SanitationStationDisplayModel;
import net.mcreator.fbms.block.display.SanitationStationDisplayItem;

public class SanitationStationDisplayItemRenderer extends GeoItemRenderer<SanitationStationDisplayItem> {
	public SanitationStationDisplayItemRenderer() {
		super(new SanitationStationDisplayModel());
	}

	@Override
	public RenderType getRenderType(SanitationStationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
