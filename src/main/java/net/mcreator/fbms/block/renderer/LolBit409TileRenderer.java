package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LolBit409BlockModel;
import net.mcreator.fbms.block.entity.LolBit409TileEntity;

public class LolBit409TileRenderer extends GeoBlockRenderer<LolBit409TileEntity> {
	public LolBit409TileRenderer() {
		super(new LolBit409BlockModel());
	}

	@Override
	public RenderType getRenderType(LolBit409TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
