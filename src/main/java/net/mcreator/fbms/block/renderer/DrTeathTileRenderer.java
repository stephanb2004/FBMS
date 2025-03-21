package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DrTeathBlockModel;
import net.mcreator.fbms.block.entity.DrTeathTileEntity;

public class DrTeathTileRenderer extends GeoBlockRenderer<DrTeathTileEntity> {
	public DrTeathTileRenderer() {
		super(new DrTeathBlockModel());
	}

	@Override
	public RenderType getRenderType(DrTeathTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
