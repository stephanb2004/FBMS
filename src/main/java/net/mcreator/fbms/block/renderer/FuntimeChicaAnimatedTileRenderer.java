package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FuntimeChicaAnimatedBlockModel;
import net.mcreator.fbms.block.entity.FuntimeChicaAnimatedTileEntity;

public class FuntimeChicaAnimatedTileRenderer extends GeoBlockRenderer<FuntimeChicaAnimatedTileEntity> {
	public FuntimeChicaAnimatedTileRenderer() {
		super(new FuntimeChicaAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(FuntimeChicaAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
