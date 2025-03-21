package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FunTimeChicaBlockModel;
import net.mcreator.fbms.block.entity.FunTimeChicaTileEntity;

public class FunTimeChicaTileRenderer extends GeoBlockRenderer<FunTimeChicaTileEntity> {
	public FunTimeChicaTileRenderer() {
		super(new FunTimeChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(FunTimeChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
