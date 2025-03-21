package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CoinDisplayModel;
import net.mcreator.fbms.block.display.CoinDisplayItem;

public class CoinDisplayItemRenderer extends GeoItemRenderer<CoinDisplayItem> {
	public CoinDisplayItemRenderer() {
		super(new CoinDisplayModel());
	}

	@Override
	public RenderType getRenderType(CoinDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
