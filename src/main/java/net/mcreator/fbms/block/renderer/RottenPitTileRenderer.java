package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RottenPitBlockModel;
import net.mcreator.fbms.block.entity.RottenPitTileEntity;

public class RottenPitTileRenderer extends GeoBlockRenderer<RottenPitTileEntity> {
	public RottenPitTileRenderer() {
		super(new RottenPitBlockModel());
	}

	@Override
	public RenderType getRenderType(RottenPitTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
