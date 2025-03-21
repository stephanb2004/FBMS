package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OrvilleBlockModel;
import net.mcreator.fbms.block.entity.OrvilleTileEntity;

public class OrvilleTileRenderer extends GeoBlockRenderer<OrvilleTileEntity> {
	public OrvilleTileRenderer() {
		super(new OrvilleBlockModel());
	}

	@Override
	public RenderType getRenderType(OrvilleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
