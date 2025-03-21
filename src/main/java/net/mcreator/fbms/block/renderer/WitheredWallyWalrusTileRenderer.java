package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WitheredWallyWalrusBlockModel;
import net.mcreator.fbms.block.entity.WitheredWallyWalrusTileEntity;

public class WitheredWallyWalrusTileRenderer extends GeoBlockRenderer<WitheredWallyWalrusTileEntity> {
	public WitheredWallyWalrusTileRenderer() {
		super(new WitheredWallyWalrusBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredWallyWalrusTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
