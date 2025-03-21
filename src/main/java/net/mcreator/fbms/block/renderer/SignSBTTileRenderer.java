package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignSBTBlockModel;
import net.mcreator.fbms.block.entity.SignSBTTileEntity;

public class SignSBTTileRenderer extends GeoBlockRenderer<SignSBTTileEntity> {
	public SignSBTTileRenderer() {
		super(new SignSBTBlockModel());
	}

	@Override
	public RenderType getRenderType(SignSBTTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
