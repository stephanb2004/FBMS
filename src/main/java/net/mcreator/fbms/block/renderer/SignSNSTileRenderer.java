package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignSNSBlockModel;
import net.mcreator.fbms.block.entity.SignSNSTileEntity;

public class SignSNSTileRenderer extends GeoBlockRenderer<SignSNSTileEntity> {
	public SignSNSTileRenderer() {
		super(new SignSNSBlockModel());
	}

	@Override
	public RenderType getRenderType(SignSNSTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
