package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MrHippoBlockModel;
import net.mcreator.fbms.block.entity.MrHippoTileEntity;

public class MrHippoTileRenderer extends GeoBlockRenderer<MrHippoTileEntity> {
	public MrHippoTileRenderer() {
		super(new MrHippoBlockModel());
	}

	@Override
	public RenderType getRenderType(MrHippoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
