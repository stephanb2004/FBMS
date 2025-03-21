package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.JollyTheRatAnimatedBlockModel;
import net.mcreator.fbms.block.entity.JollyTheRatAnimatedTileEntity;

public class JollyTheRatAnimatedTileRenderer extends GeoBlockRenderer<JollyTheRatAnimatedTileEntity> {
	public JollyTheRatAnimatedTileRenderer() {
		super(new JollyTheRatAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(JollyTheRatAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
