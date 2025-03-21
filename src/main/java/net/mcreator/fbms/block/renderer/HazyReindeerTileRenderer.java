package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HazyReindeerBlockModel;
import net.mcreator.fbms.block.entity.HazyReindeerTileEntity;

public class HazyReindeerTileRenderer extends GeoBlockRenderer<HazyReindeerTileEntity> {
	public HazyReindeerTileRenderer() {
		super(new HazyReindeerBlockModel());
	}

	@Override
	public RenderType getRenderType(HazyReindeerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
