package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RustyBlockModel;
import net.mcreator.fbms.block.entity.RustyTileEntity;

public class RustyTileRenderer extends GeoBlockRenderer<RustyTileEntity> {
	public RustyTileRenderer() {
		super(new RustyBlockModel());
	}

	@Override
	public RenderType getRenderType(RustyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
