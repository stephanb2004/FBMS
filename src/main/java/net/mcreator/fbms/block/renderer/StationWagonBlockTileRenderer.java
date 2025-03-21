package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.StationWagonBlockBlockModel;
import net.mcreator.fbms.block.entity.StationWagonBlockTileEntity;

public class StationWagonBlockTileRenderer extends GeoBlockRenderer<StationWagonBlockTileEntity> {
	public StationWagonBlockTileRenderer() {
		super(new StationWagonBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(StationWagonBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
