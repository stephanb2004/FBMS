package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DeluxeSpeakerSetBlockModel;
import net.mcreator.fbms.block.entity.DeluxeSpeakerSetTileEntity;

public class DeluxeSpeakerSetTileRenderer extends GeoBlockRenderer<DeluxeSpeakerSetTileEntity> {
	public DeluxeSpeakerSetTileRenderer() {
		super(new DeluxeSpeakerSetBlockModel());
	}

	@Override
	public RenderType getRenderType(DeluxeSpeakerSetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
