package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SanitationStationBlockModel;
import net.mcreator.fbms.block.entity.SanitationStationTileEntity;

public class SanitationStationTileRenderer extends GeoBlockRenderer<SanitationStationTileEntity> {
	public SanitationStationTileRenderer() {
		super(new SanitationStationBlockModel());
	}

	@Override
	public RenderType getRenderType(SanitationStationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
