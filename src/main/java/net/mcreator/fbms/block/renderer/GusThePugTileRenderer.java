package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GusThePugBlockModel;
import net.mcreator.fbms.block.entity.GusThePugTileEntity;

public class GusThePugTileRenderer extends GeoBlockRenderer<GusThePugTileEntity> {
	public GusThePugTileRenderer() {
		super(new GusThePugBlockModel());
	}

	@Override
	public RenderType getRenderType(GusThePugTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
