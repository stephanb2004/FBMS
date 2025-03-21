package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MrHippoAnimatedBlockModel;
import net.mcreator.fbms.block.entity.MrHippoAnimatedTileEntity;

public class MrHippoAnimatedTileRenderer extends GeoBlockRenderer<MrHippoAnimatedTileEntity> {
	public MrHippoAnimatedTileRenderer() {
		super(new MrHippoAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(MrHippoAnimatedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
