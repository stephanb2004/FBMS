package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FtFreddyBlockModel;
import net.mcreator.fbms.block.entity.FtFreddyTileEntity;

public class FtFreddyTileRenderer extends GeoBlockRenderer<FtFreddyTileEntity> {
	public FtFreddyTileRenderer() {
		super(new FtFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(FtFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
