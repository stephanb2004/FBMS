package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LolBitDisplayModel;
import net.mcreator.fbms.block.display.LolBitDisplayItem;

public class LolBitDisplayItemRenderer extends GeoItemRenderer<LolBitDisplayItem> {
	public LolBitDisplayItemRenderer() {
		super(new LolBitDisplayModel());
	}

	@Override
	public RenderType getRenderType(LolBitDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
