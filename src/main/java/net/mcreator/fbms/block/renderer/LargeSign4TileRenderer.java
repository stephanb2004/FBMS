package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign4BlockModel;
import net.mcreator.fbms.block.entity.LargeSign4TileEntity;

public class LargeSign4TileRenderer extends GeoBlockRenderer<LargeSign4TileEntity> {
	public LargeSign4TileRenderer() {
		super(new LargeSign4BlockModel());
	}

	@Override
	public RenderType getRenderType(LargeSign4TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
