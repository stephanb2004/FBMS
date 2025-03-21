package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MoltenSitBlockModel;
import net.mcreator.fbms.block.entity.MoltenSitTileEntity;

public class MoltenSitTileRenderer extends GeoBlockRenderer<MoltenSitTileEntity> {
	public MoltenSitTileRenderer() {
		super(new MoltenSitBlockModel());
	}

	@Override
	public RenderType getRenderType(MoltenSitTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
