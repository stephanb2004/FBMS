package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LolBit409DisplayModel;
import net.mcreator.fbms.block.display.LolBit409DisplayItem;

public class LolBit409DisplayItemRenderer extends GeoItemRenderer<LolBit409DisplayItem> {
	public LolBit409DisplayItemRenderer() {
		super(new LolBit409DisplayModel());
	}

	@Override
	public RenderType getRenderType(LolBit409DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
