package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet3DisplayModel;
import net.mcreator.fbms.block.display.FoilPartySet3DisplayItem;

public class FoilPartySet3DisplayItemRenderer extends GeoItemRenderer<FoilPartySet3DisplayItem> {
	public FoilPartySet3DisplayItemRenderer() {
		super(new FoilPartySet3DisplayModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
