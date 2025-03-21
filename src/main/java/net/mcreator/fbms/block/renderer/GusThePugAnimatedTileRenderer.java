package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GusThePugAnimatedBlockModel;
import net.mcreator.fbms.block.entity.GusThePugAnimatedTileEntity;

public class GusThePugAnimatedTileRenderer extends GeoBlockRenderer<GusThePugAnimatedTileEntity> {
	public GusThePugAnimatedTileRenderer() {
		super(new GusThePugAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(GusThePugAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
