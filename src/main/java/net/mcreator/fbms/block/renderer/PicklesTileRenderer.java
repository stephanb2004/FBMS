package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PicklesBlockModel;
import net.mcreator.fbms.block.entity.PicklesTileEntity;

public class PicklesTileRenderer extends GeoBlockRenderer<PicklesTileEntity> {
	public PicklesTileRenderer() {
		super(new PicklesBlockModel());
	}

	@Override
	public RenderType getRenderType(PicklesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
