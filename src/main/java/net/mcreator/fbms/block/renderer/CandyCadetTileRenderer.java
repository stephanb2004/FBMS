package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CandyCadetBlockModel;
import net.mcreator.fbms.block.entity.CandyCadetTileEntity;

public class CandyCadetTileRenderer extends GeoBlockRenderer<CandyCadetTileEntity> {
	public CandyCadetTileRenderer() {
		super(new CandyCadetBlockModel());
	}

	@Override
	public RenderType getRenderType(CandyCadetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
