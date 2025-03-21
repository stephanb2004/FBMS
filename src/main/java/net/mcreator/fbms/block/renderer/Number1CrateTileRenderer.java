package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Number1CrateBlockModel;
import net.mcreator.fbms.block.entity.Number1CrateTileEntity;

public class Number1CrateTileRenderer extends GeoBlockRenderer<Number1CrateTileEntity> {
	public Number1CrateTileRenderer() {
		super(new Number1CrateBlockModel());
	}

	@Override
	public RenderType getRenderType(Number1CrateTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
