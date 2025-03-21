package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MusicManAnimatedBlockModel;
import net.mcreator.fbms.block.entity.MusicManAnimatedTileEntity;

public class MusicManAnimatedTileRenderer extends GeoBlockRenderer<MusicManAnimatedTileEntity> {
	public MusicManAnimatedTileRenderer() {
		super(new MusicManAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(MusicManAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
