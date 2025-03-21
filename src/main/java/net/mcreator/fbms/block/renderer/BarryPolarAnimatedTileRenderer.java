package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BarryPolarAnimatedBlockModel;
import net.mcreator.fbms.block.entity.BarryPolarAnimatedTileEntity;

public class BarryPolarAnimatedTileRenderer extends GeoBlockRenderer<BarryPolarAnimatedTileEntity> {
	public BarryPolarAnimatedTileRenderer() {
		super(new BarryPolarAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
