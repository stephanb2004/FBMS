package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FredbearDeactivatedBlockModel;
import net.mcreator.fbms.block.entity.FredbearDeactivatedTileEntity;

public class FredbearDeactivatedTileRenderer extends GeoBlockRenderer<FredbearDeactivatedTileEntity> {
	public FredbearDeactivatedTileRenderer() {
		super(new FredbearDeactivatedBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearDeactivatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
