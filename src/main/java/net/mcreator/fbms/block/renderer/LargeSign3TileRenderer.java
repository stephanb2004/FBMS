package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign3BlockModel;
import net.mcreator.fbms.block.entity.LargeSign3TileEntity;

public class LargeSign3TileRenderer extends GeoBlockRenderer<LargeSign3TileEntity> {
	public LargeSign3TileRenderer() {
		super(new LargeSign3BlockModel());
	}

	@Override
	public RenderType getRenderType(LargeSign3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
