package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BrokenBarryPolarAnimatedBlockModel;
import net.mcreator.fbms.block.entity.BrokenBarryPolarAnimatedTileEntity;

public class BrokenBarryPolarAnimatedTileRenderer extends GeoBlockRenderer<BrokenBarryPolarAnimatedTileEntity> {
	public BrokenBarryPolarAnimatedTileRenderer() {
		super(new BrokenBarryPolarAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(BrokenBarryPolarAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
