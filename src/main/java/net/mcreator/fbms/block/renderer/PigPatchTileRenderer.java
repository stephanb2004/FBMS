package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PigPatchBlockModel;
import net.mcreator.fbms.block.entity.PigPatchTileEntity;

public class PigPatchTileRenderer extends GeoBlockRenderer<PigPatchTileEntity> {
	public PigPatchTileRenderer() {
		super(new PigPatchBlockModel());
	}

	@Override
	public RenderType getRenderType(PigPatchTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
