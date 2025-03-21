package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonBlueLightStripBlockModel;
import net.mcreator.fbms.block.entity.NeonBlueLightStripTileEntity;

public class NeonBlueLightStripTileRenderer extends GeoBlockRenderer<NeonBlueLightStripTileEntity> {
	public NeonBlueLightStripTileRenderer() {
		super(new NeonBlueLightStripBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonBlueLightStripTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
