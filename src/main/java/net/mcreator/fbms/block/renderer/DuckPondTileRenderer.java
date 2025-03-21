package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DuckPondBlockModel;
import net.mcreator.fbms.block.entity.DuckPondTileEntity;

public class DuckPondTileRenderer extends GeoBlockRenderer<DuckPondTileEntity> {
	public DuckPondTileRenderer() {
		super(new DuckPondBlockModel());
	}

	@Override
	public RenderType getRenderType(DuckPondTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
