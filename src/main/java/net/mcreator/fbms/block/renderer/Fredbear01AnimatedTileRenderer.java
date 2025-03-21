package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Fredbear01AnimatedBlockModel;
import net.mcreator.fbms.block.entity.Fredbear01AnimatedTileEntity;

public class Fredbear01AnimatedTileRenderer extends GeoBlockRenderer<Fredbear01AnimatedTileEntity> {
	public Fredbear01AnimatedTileRenderer() {
		super(new Fredbear01AnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01AnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
