package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet1DisplayModel;
import net.mcreator.fbms.block.display.FoilPartySet1DisplayItem;

public class FoilPartySet1DisplayItemRenderer extends GeoItemRenderer<FoilPartySet1DisplayItem> {
	public FoilPartySet1DisplayItemRenderer() {
		super(new FoilPartySet1DisplayModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
