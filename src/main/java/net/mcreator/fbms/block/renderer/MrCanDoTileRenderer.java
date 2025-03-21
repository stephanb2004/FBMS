package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MrCanDoBlockModel;
import net.mcreator.fbms.block.entity.MrCanDoTileEntity;

public class MrCanDoTileRenderer extends GeoBlockRenderer<MrCanDoTileEntity> {
	public MrCanDoTileRenderer() {
		super(new MrCanDoBlockModel());
	}

	@Override
	public RenderType getRenderType(MrCanDoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
