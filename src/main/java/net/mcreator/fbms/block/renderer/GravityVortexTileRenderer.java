package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GravityVortexBlockModel;
import net.mcreator.fbms.block.entity.GravityVortexTileEntity;

public class GravityVortexTileRenderer extends GeoBlockRenderer<GravityVortexTileEntity> {
	public GravityVortexTileRenderer() {
		super(new GravityVortexBlockModel());
	}

	@Override
	public RenderType getRenderType(GravityVortexTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
