package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.StationWagonBlockDisplayModel;
import net.mcreator.fbms.block.display.StationWagonBlockDisplayItem;

public class StationWagonBlockDisplayItemRenderer extends GeoItemRenderer<StationWagonBlockDisplayItem> {
	public StationWagonBlockDisplayItemRenderer() {
		super(new StationWagonBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(StationWagonBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
