package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PigPatchAnimatedBlockModel;
import net.mcreator.fbms.block.entity.PigPatchAnimatedTileEntity;

public class PigPatchAnimatedTileRenderer extends GeoBlockRenderer<PigPatchAnimatedTileEntity> {
	public PigPatchAnimatedTileRenderer() {
		super(new PigPatchAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(PigPatchAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
