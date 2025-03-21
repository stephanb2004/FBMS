package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SignDDWBlockModel;
import net.mcreator.fbms.block.entity.SignDDWTileEntity;

public class SignDDWTileRenderer extends GeoBlockRenderer<SignDDWTileEntity> {
	public SignDDWTileRenderer() {
		super(new SignDDWBlockModel());
	}

	@Override
	public RenderType getRenderType(SignDDWTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
