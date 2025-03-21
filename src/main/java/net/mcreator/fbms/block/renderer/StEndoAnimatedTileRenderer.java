package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.StEndoAnimatedBlockModel;
import net.mcreator.fbms.block.entity.StEndoAnimatedTileEntity;

public class StEndoAnimatedTileRenderer extends GeoBlockRenderer<StEndoAnimatedTileEntity> {
	public StEndoAnimatedTileRenderer() {
		super(new StEndoAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(StEndoAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
