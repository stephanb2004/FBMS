package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HappyFrogBlockModel;
import net.mcreator.fbms.block.entity.HappyFrogTileEntity;

public class HappyFrogTileRenderer extends GeoBlockRenderer<HappyFrogTileEntity> {
	public HappyFrogTileRenderer() {
		super(new HappyFrogBlockModel());
	}

	@Override
	public RenderType getRenderType(HappyFrogTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
