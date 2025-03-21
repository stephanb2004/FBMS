package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RidingRocketsRedBlockModel;
import net.mcreator.fbms.block.entity.RidingRocketsRedTileEntity;

public class RidingRocketsRedTileRenderer extends GeoBlockRenderer<RidingRocketsRedTileEntity> {
	public RidingRocketsRedTileRenderer() {
		super(new RidingRocketsRedBlockModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketsRedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
