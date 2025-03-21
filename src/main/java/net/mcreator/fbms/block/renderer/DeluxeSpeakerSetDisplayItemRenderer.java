package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DeluxeSpeakerSetDisplayModel;
import net.mcreator.fbms.block.display.DeluxeSpeakerSetDisplayItem;

public class DeluxeSpeakerSetDisplayItemRenderer extends GeoItemRenderer<DeluxeSpeakerSetDisplayItem> {
	public DeluxeSpeakerSetDisplayItemRenderer() {
		super(new DeluxeSpeakerSetDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeluxeSpeakerSetDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
