package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LeftyBlockModel;
import net.mcreator.fbms.block.entity.LeftyTileEntity;

public class LeftyTileRenderer extends GeoBlockRenderer<LeftyTileEntity> {
	public LeftyTileRenderer() {
		super(new LeftyBlockModel());
	}

	@Override
	public RenderType getRenderType(LeftyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
