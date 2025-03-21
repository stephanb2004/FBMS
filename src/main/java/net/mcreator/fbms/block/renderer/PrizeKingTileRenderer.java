package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PrizeKingBlockModel;
import net.mcreator.fbms.block.entity.PrizeKingTileEntity;

public class PrizeKingTileRenderer extends GeoBlockRenderer<PrizeKingTileEntity> {
	public PrizeKingTileRenderer() {
		super(new PrizeKingBlockModel());
	}

	@Override
	public RenderType getRenderType(PrizeKingTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
