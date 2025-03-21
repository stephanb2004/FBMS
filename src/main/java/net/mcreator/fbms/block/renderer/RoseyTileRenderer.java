package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RoseyBlockModel;
import net.mcreator.fbms.block.entity.RoseyTileEntity;

public class RoseyTileRenderer extends GeoBlockRenderer<RoseyTileEntity> {
	public RoseyTileRenderer() {
		super(new RoseyBlockModel());
	}

	@Override
	public RenderType getRenderType(RoseyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
