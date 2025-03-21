package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Endo01BlockModel;
import net.mcreator.fbms.block.entity.Endo01TileEntity;

public class Endo01TileRenderer extends GeoBlockRenderer<Endo01TileEntity> {
	public Endo01TileRenderer() {
		super(new Endo01BlockModel());
	}

	@Override
	public RenderType getRenderType(Endo01TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
