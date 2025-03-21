package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Fredbear01BlockModel;
import net.mcreator.fbms.block.entity.Fredbear01TileEntity;

public class Fredbear01TileRenderer extends GeoBlockRenderer<Fredbear01TileEntity> {
	public Fredbear01TileRenderer() {
		super(new Fredbear01BlockModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
