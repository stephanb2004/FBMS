package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignMSBlockModel;
import net.mcreator.fbms.block.entity.SignMSTileEntity;

public class SignMSTileRenderer extends GeoBlockRenderer<SignMSTileEntity> {
	public SignMSTileRenderer() {
		super(new SignMSBlockModel());
	}

	@Override
	public RenderType getRenderType(SignMSTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
