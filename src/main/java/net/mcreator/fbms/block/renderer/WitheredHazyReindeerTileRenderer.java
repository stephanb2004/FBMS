package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WitheredHazyReindeerBlockModel;
import net.mcreator.fbms.block.entity.WitheredHazyReindeerTileEntity;

public class WitheredHazyReindeerTileRenderer extends GeoBlockRenderer<WitheredHazyReindeerTileEntity> {
	public WitheredHazyReindeerTileRenderer() {
		super(new WitheredHazyReindeerBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredHazyReindeerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
