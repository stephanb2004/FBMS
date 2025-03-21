package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignRFABlockModel;
import net.mcreator.fbms.block.entity.SignRFATileEntity;

public class SignRFATileRenderer extends GeoBlockRenderer<SignRFATileEntity> {
	public SignRFATileRenderer() {
		super(new SignRFABlockModel());
	}

	@Override
	public RenderType getRenderType(SignRFATileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
