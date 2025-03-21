package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BarryPolarFixedBlockModel;
import net.mcreator.fbms.block.entity.BarryPolarFixedTileEntity;

public class BarryPolarFixedTileRenderer extends GeoBlockRenderer<BarryPolarFixedTileEntity> {
	public BarryPolarFixedTileRenderer() {
		super(new BarryPolarFixedBlockModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarFixedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
