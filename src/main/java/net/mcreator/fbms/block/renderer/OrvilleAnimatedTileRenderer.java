package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OrvilleAnimatedBlockModel;
import net.mcreator.fbms.block.entity.OrvilleAnimatedTileEntity;

public class OrvilleAnimatedTileRenderer extends GeoBlockRenderer<OrvilleAnimatedTileEntity> {
	public OrvilleAnimatedTileRenderer() {
		super(new OrvilleAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(OrvilleAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
