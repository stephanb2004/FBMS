package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonBlueLightStripLeftBlockModel;
import net.mcreator.fbms.block.entity.NeonBlueLightStripLeftTileEntity;

public class NeonBlueLightStripLeftTileRenderer extends GeoBlockRenderer<NeonBlueLightStripLeftTileEntity> {
	public NeonBlueLightStripLeftTileRenderer() {
		super(new NeonBlueLightStripLeftBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonBlueLightStripLeftTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
