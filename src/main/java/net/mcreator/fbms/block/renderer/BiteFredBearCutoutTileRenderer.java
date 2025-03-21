package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BiteFredBearCutoutBlockModel;
import net.mcreator.fbms.block.entity.BiteFredBearCutoutTileEntity;

public class BiteFredBearCutoutTileRenderer extends GeoBlockRenderer<BiteFredBearCutoutTileEntity> {
	public BiteFredBearCutoutTileRenderer() {
		super(new BiteFredBearCutoutBlockModel());
	}

	@Override
	public RenderType getRenderType(BiteFredBearCutoutTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
