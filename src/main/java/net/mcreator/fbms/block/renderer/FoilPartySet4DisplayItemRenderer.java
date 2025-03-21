package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet4DisplayModel;
import net.mcreator.fbms.block.display.FoilPartySet4DisplayItem;

public class FoilPartySet4DisplayItemRenderer extends GeoItemRenderer<FoilPartySet4DisplayItem> {
	public FoilPartySet4DisplayItemRenderer() {
		super(new FoilPartySet4DisplayModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet4DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
