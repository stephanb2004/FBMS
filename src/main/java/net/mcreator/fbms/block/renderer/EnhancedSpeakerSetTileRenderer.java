package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.EnhancedSpeakerSetBlockModel;
import net.mcreator.fbms.block.entity.EnhancedSpeakerSetTileEntity;

public class EnhancedSpeakerSetTileRenderer extends GeoBlockRenderer<EnhancedSpeakerSetTileEntity> {
	public EnhancedSpeakerSetTileRenderer() {
		super(new EnhancedSpeakerSetBlockModel());
	}

	@Override
	public RenderType getRenderType(EnhancedSpeakerSetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
