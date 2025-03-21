package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HappYFrogAnimatedBlockModel;
import net.mcreator.fbms.block.entity.HappYFrogAnimatedTileEntity;

public class HappYFrogAnimatedTileRenderer extends GeoBlockRenderer<HappYFrogAnimatedTileEntity> {
	public HappYFrogAnimatedTileRenderer() {
		super(new HappYFrogAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(HappYFrogAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
