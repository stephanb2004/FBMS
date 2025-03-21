package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FtFoxyBlockModel;
import net.mcreator.fbms.block.entity.FtFoxyTileEntity;

public class FtFoxyTileRenderer extends GeoBlockRenderer<FtFoxyTileEntity> {
	public FtFoxyTileRenderer() {
		super(new FtFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(FtFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
