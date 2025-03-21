package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LeftyAnimatedBlockModel;
import net.mcreator.fbms.block.entity.LeftyAnimatedTileEntity;

public class LeftyAnimatedTileRenderer extends GeoBlockRenderer<LeftyAnimatedTileEntity> {
	public LeftyAnimatedTileRenderer() {
		super(new LeftyAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(LeftyAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
