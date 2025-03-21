package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Endo01AnimatedBlockModel;
import net.mcreator.fbms.block.entity.Endo01AnimatedTileEntity;

public class Endo01AnimatedTileRenderer extends GeoBlockRenderer<Endo01AnimatedTileEntity> {
	public Endo01AnimatedTileRenderer() {
		super(new Endo01AnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo01AnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
