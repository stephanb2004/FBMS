package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyChicaBlockModel;
import net.mcreator.fbms.block.entity.ToyChicaTileEntity;

public class ToyChicaTileRenderer extends GeoBlockRenderer<ToyChicaTileEntity> {
	public ToyChicaTileRenderer() {
		super(new ToyChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
