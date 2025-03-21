package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DougTheDogAnimatedBlockModel;
import net.mcreator.fbms.block.entity.DougTheDogAnimatedTileEntity;

public class DougTheDogAnimatedTileRenderer extends GeoBlockRenderer<DougTheDogAnimatedTileEntity> {
	public DougTheDogAnimatedTileRenderer() {
		super(new DougTheDogAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(DougTheDogAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
