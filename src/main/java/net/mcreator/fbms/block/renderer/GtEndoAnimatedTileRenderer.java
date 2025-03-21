package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GtEndoAnimatedBlockModel;
import net.mcreator.fbms.block.entity.GtEndoAnimatedTileEntity;

public class GtEndoAnimatedTileRenderer extends GeoBlockRenderer<GtEndoAnimatedTileEntity> {
	public GtEndoAnimatedTileRenderer() {
		super(new GtEndoAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(GtEndoAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
