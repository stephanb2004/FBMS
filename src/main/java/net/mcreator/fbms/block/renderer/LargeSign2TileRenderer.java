package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign2BlockModel;
import net.mcreator.fbms.block.entity.LargeSign2TileEntity;

public class LargeSign2TileRenderer extends GeoBlockRenderer<LargeSign2TileEntity> {
	public LargeSign2TileRenderer() {
		super(new LargeSign2BlockModel());
	}

	@Override
	public RenderType getRenderType(LargeSign2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
