package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CamBlockModel;
import net.mcreator.fbms.block.entity.CamTileEntity;

public class CamTileRenderer extends GeoBlockRenderer<CamTileEntity> {
	public CamTileRenderer() {
		super(new CamBlockModel());
	}

	@Override
	public RenderType getRenderType(CamTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
