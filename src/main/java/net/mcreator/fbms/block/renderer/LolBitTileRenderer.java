package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LolBitBlockModel;
import net.mcreator.fbms.block.entity.LolBitTileEntity;

public class LolBitTileRenderer extends GeoBlockRenderer<LolBitTileEntity> {
	public LolBitTileRenderer() {
		super(new LolBitBlockModel());
	}

	@Override
	public RenderType getRenderType(LolBitTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
