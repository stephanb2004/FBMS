package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FreddyFazBearBlockModel;
import net.mcreator.fbms.block.entity.FreddyFazBearTileEntity;

public class FreddyFazBearTileRenderer extends GeoBlockRenderer<FreddyFazBearTileEntity> {
	public FreddyFazBearTileRenderer() {
		super(new FreddyFazBearBlockModel());
	}

	@Override
	public RenderType getRenderType(FreddyFazBearTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
