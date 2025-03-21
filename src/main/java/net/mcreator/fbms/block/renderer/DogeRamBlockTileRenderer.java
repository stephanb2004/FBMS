package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DogeRamBlockBlockModel;
import net.mcreator.fbms.block.entity.DogeRamBlockTileEntity;

public class DogeRamBlockTileRenderer extends GeoBlockRenderer<DogeRamBlockTileEntity> {
	public DogeRamBlockTileRenderer() {
		super(new DogeRamBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DogeRamBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
