package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ElChipAnimatedBlockModel;
import net.mcreator.fbms.block.entity.ElChipAnimatedTileEntity;

public class ElChipAnimatedTileRenderer extends GeoBlockRenderer<ElChipAnimatedTileEntity> {
	public ElChipAnimatedTileRenderer() {
		super(new ElChipAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(ElChipAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
