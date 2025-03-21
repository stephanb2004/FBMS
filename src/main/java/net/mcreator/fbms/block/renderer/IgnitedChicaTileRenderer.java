package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.IgnitedChicaBlockModel;
import net.mcreator.fbms.block.entity.IgnitedChicaTileEntity;

public class IgnitedChicaTileRenderer extends GeoBlockRenderer<IgnitedChicaTileEntity> {
	public IgnitedChicaTileRenderer() {
		super(new IgnitedChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(IgnitedChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
