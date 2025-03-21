package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSignBlockModel;
import net.mcreator.fbms.block.entity.LargeSignTileEntity;

public class LargeSignTileRenderer extends GeoBlockRenderer<LargeSignTileEntity> {
	public LargeSignTileRenderer() {
		super(new LargeSignBlockModel());
	}

	@Override
	public RenderType getRenderType(LargeSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
