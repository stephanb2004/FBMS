package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ElChipBlockModel;
import net.mcreator.fbms.block.entity.ElChipTileEntity;

public class ElChipTileRenderer extends GeoBlockRenderer<ElChipTileEntity> {
	public ElChipTileRenderer() {
		super(new ElChipBlockModel());
	}

	@Override
	public RenderType getRenderType(ElChipTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
