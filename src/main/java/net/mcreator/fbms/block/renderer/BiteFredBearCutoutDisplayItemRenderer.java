package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BiteFredBearCutoutDisplayModel;
import net.mcreator.fbms.block.display.BiteFredBearCutoutDisplayItem;

public class BiteFredBearCutoutDisplayItemRenderer extends GeoItemRenderer<BiteFredBearCutoutDisplayItem> {
	public BiteFredBearCutoutDisplayItemRenderer() {
		super(new BiteFredBearCutoutDisplayModel());
	}

	@Override
	public RenderType getRenderType(BiteFredBearCutoutDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
