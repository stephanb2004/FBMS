package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WitheredPuffyPuffinsBlockModel;
import net.mcreator.fbms.block.entity.WitheredPuffyPuffinsTileEntity;

public class WitheredPuffyPuffinsTileRenderer extends GeoBlockRenderer<WitheredPuffyPuffinsTileEntity> {
	public WitheredPuffyPuffinsTileRenderer() {
		super(new WitheredPuffyPuffinsBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredPuffyPuffinsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
