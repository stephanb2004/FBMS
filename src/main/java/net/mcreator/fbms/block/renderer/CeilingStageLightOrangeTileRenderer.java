package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightOrangeBlockModel;
import net.mcreator.fbms.block.entity.CeilingStageLightOrangeTileEntity;

public class CeilingStageLightOrangeTileRenderer extends GeoBlockRenderer<CeilingStageLightOrangeTileEntity> {
	public CeilingStageLightOrangeTileRenderer() {
		super(new CeilingStageLightOrangeBlockModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightOrangeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
