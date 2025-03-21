package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LolBitDtBlockModel;
import net.mcreator.fbms.block.entity.LolBitDtTileEntity;

public class LolBitDtTileRenderer extends GeoBlockRenderer<LolBitDtTileEntity> {
	public LolBitDtTileRenderer() {
		super(new LolBitDtBlockModel());
	}

	@Override
	public RenderType getRenderType(LolBitDtTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
