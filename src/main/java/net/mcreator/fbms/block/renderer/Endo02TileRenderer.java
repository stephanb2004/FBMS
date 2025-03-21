package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Endo02BlockModel;
import net.mcreator.fbms.block.entity.Endo02TileEntity;

public class Endo02TileRenderer extends GeoBlockRenderer<Endo02TileEntity> {
	public Endo02TileRenderer() {
		super(new Endo02BlockModel());
	}

	@Override
	public RenderType getRenderType(Endo02TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
