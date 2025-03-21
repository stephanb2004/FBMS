package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HazyReindeerAnimatedBlockModel;
import net.mcreator.fbms.block.entity.HazyReindeerAnimatedTileEntity;

public class HazyReindeerAnimatedTileRenderer extends GeoBlockRenderer<HazyReindeerAnimatedTileEntity> {
	public HazyReindeerAnimatedTileRenderer() {
		super(new HazyReindeerAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(HazyReindeerAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
