package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HeavyDuityDoorClosedBlockModel;
import net.mcreator.fbms.block.entity.HeavyDuityDoorClosedTileEntity;

public class HeavyDuityDoorClosedTileRenderer extends GeoBlockRenderer<HeavyDuityDoorClosedTileEntity> {
	public HeavyDuityDoorClosedTileRenderer() {
		super(new HeavyDuityDoorClosedBlockModel());
	}

	@Override
	public RenderType getRenderType(HeavyDuityDoorClosedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
