package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LolbitRecordDisplayModel;
import net.mcreator.fbms.block.display.LolbitRecordDisplayItem;

public class LolbitRecordDisplayItemRenderer extends GeoItemRenderer<LolbitRecordDisplayItem> {
	public LolbitRecordDisplayItemRenderer() {
		super(new LolbitRecordDisplayModel());
	}

	@Override
	public RenderType getRenderType(LolbitRecordDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
