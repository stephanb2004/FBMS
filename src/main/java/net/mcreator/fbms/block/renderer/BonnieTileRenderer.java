package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonnieBlockModel;
import net.mcreator.fbms.block.entity.BonnieTileEntity;

public class BonnieTileRenderer extends GeoBlockRenderer<BonnieTileEntity> {
	public BonnieTileRenderer() {
		super(new BonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(BonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
