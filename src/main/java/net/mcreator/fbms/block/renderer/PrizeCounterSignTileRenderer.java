package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PrizeCounterSignBlockModel;
import net.mcreator.fbms.block.entity.PrizeCounterSignTileEntity;

public class PrizeCounterSignTileRenderer extends GeoBlockRenderer<PrizeCounterSignTileEntity> {
	public PrizeCounterSignTileRenderer() {
		super(new PrizeCounterSignBlockModel());
	}

	@Override
	public RenderType getRenderType(PrizeCounterSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
