package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WitheredDougTheDogBlockModel;
import net.mcreator.fbms.block.entity.WitheredDougTheDogTileEntity;

public class WitheredDougTheDogTileRenderer extends GeoBlockRenderer<WitheredDougTheDogTileEntity> {
	public WitheredDougTheDogTileRenderer() {
		super(new WitheredDougTheDogBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredDougTheDogTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
