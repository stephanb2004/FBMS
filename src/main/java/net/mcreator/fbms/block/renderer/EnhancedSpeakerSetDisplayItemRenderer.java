package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.EnhancedSpeakerSetDisplayModel;
import net.mcreator.fbms.block.display.EnhancedSpeakerSetDisplayItem;

public class EnhancedSpeakerSetDisplayItemRenderer extends GeoItemRenderer<EnhancedSpeakerSetDisplayItem> {
	public EnhancedSpeakerSetDisplayItemRenderer() {
		super(new EnhancedSpeakerSetDisplayModel());
	}

	@Override
	public RenderType getRenderType(EnhancedSpeakerSetDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
