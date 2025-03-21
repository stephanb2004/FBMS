package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GravityVortex2BlockModel;
import net.mcreator.fbms.block.entity.GravityVortex2TileEntity;

public class GravityVortex2TileRenderer extends GeoBlockRenderer<GravityVortex2TileEntity> {
	public GravityVortex2TileRenderer() {
		super(new GravityVortex2BlockModel());
	}

	@Override
	public RenderType getRenderType(GravityVortex2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
