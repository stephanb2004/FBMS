package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FrightsSignBlockModel;
import net.mcreator.fbms.block.entity.FrightsSignTileEntity;

public class FrightsSignTileRenderer extends GeoBlockRenderer<FrightsSignTileEntity> {
	public FrightsSignTileRenderer() {
		super(new FrightsSignBlockModel());
	}

	@Override
	public RenderType getRenderType(FrightsSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
