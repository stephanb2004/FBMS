package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MusicManBlockModel;
import net.mcreator.fbms.block.entity.MusicManTileEntity;

public class MusicManTileRenderer extends GeoBlockRenderer<MusicManTileEntity> {
	public MusicManTileRenderer() {
		super(new MusicManBlockModel());
	}

	@Override
	public RenderType getRenderType(MusicManTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
