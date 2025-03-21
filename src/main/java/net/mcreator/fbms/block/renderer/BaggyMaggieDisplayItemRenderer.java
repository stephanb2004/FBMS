package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BaggyMaggieDisplayModel;
import net.mcreator.fbms.block.display.BaggyMaggieDisplayItem;

public class BaggyMaggieDisplayItemRenderer extends GeoItemRenderer<BaggyMaggieDisplayItem> {
	public BaggyMaggieDisplayItemRenderer() {
		super(new BaggyMaggieDisplayModel());
	}

	@Override
	public RenderType getRenderType(BaggyMaggieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
