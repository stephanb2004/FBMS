package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MidnightMotoristBlockModel;
import net.mcreator.fbms.block.entity.MidnightMotoristTileEntity;

public class MidnightMotoristTileRenderer extends GeoBlockRenderer<MidnightMotoristTileEntity> {
	public MidnightMotoristTileRenderer() {
		super(new MidnightMotoristBlockModel());
	}

	@Override
	public RenderType getRenderType(MidnightMotoristTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
