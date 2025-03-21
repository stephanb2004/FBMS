package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CoinBlockModel;
import net.mcreator.fbms.block.entity.CoinTileEntity;

public class CoinTileRenderer extends GeoBlockRenderer<CoinTileEntity> {
	public CoinTileRenderer() {
		super(new CoinBlockModel());
	}

	@Override
	public RenderType getRenderType(CoinTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
