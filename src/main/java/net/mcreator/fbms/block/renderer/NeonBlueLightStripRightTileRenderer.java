package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonBlueLightStripRightBlockModel;
import net.mcreator.fbms.block.entity.NeonBlueLightStripRightTileEntity;

public class NeonBlueLightStripRightTileRenderer extends GeoBlockRenderer<NeonBlueLightStripRightTileEntity> {
	public NeonBlueLightStripRightTileRenderer() {
		super(new NeonBlueLightStripRightBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonBlueLightStripRightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
