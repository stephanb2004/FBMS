package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DougTheDogBlockModel;
import net.mcreator.fbms.block.entity.DougTheDogTileEntity;

public class DougTheDogTileRenderer extends GeoBlockRenderer<DougTheDogTileEntity> {
	public DougTheDogTileRenderer() {
		super(new DougTheDogBlockModel());
	}

	@Override
	public RenderType getRenderType(DougTheDogTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
