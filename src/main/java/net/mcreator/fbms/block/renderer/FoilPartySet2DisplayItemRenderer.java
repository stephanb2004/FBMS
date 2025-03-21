package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet2DisplayModel;
import net.mcreator.fbms.block.display.FoilPartySet2DisplayItem;

public class FoilPartySet2DisplayItemRenderer extends GeoItemRenderer<FoilPartySet2DisplayItem> {
	public FoilPartySet2DisplayItemRenderer() {
		super(new FoilPartySet2DisplayModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
