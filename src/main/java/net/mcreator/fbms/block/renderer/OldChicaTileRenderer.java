package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldChicaBlockModel;
import net.mcreator.fbms.block.entity.OldChicaTileEntity;

public class OldChicaTileRenderer extends GeoBlockRenderer<OldChicaTileEntity> {
	public OldChicaTileRenderer() {
		super(new OldChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(OldChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
