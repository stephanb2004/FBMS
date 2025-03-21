package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FrightsSign2BlockModel;
import net.mcreator.fbms.block.entity.FrightsSign2TileEntity;

public class FrightsSign2TileRenderer extends GeoBlockRenderer<FrightsSign2TileEntity> {
	public FrightsSign2TileRenderer() {
		super(new FrightsSign2BlockModel());
	}

	@Override
	public RenderType getRenderType(FrightsSign2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
