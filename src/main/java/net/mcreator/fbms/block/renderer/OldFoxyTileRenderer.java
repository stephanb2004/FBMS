package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldFoxyBlockModel;
import net.mcreator.fbms.block.entity.OldFoxyTileEntity;

public class OldFoxyTileRenderer extends GeoBlockRenderer<OldFoxyTileEntity> {
	public OldFoxyTileRenderer() {
		super(new OldFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(OldFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
