package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PuffyPuffinsAnimatedBlockModel;
import net.mcreator.fbms.block.entity.PuffyPuffinsAnimatedTileEntity;

public class PuffyPuffinsAnimatedTileRenderer extends GeoBlockRenderer<PuffyPuffinsAnimatedTileEntity> {
	public PuffyPuffinsAnimatedTileRenderer() {
		super(new PuffyPuffinsAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(PuffyPuffinsAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
