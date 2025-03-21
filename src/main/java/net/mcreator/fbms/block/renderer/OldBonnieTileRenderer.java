package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldBonnieBlockModel;
import net.mcreator.fbms.block.entity.OldBonnieTileEntity;

public class OldBonnieTileRenderer extends GeoBlockRenderer<OldBonnieTileEntity> {
	public OldBonnieTileRenderer() {
		super(new OldBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(OldBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
