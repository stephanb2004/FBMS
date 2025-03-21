package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RustyAnimatedBlockModel;
import net.mcreator.fbms.block.entity.RustyAnimatedTileEntity;

public class RustyAnimatedTileRenderer extends GeoBlockRenderer<RustyAnimatedTileEntity> {
	public RustyAnimatedTileRenderer() {
		super(new RustyAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(RustyAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
