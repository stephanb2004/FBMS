package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ToyFreddyBlockModel;
import net.mcreator.fbms.block.entity.ToyFreddyTileEntity;

public class ToyFreddyTileRenderer extends GeoBlockRenderer<ToyFreddyTileEntity> {
	public ToyFreddyTileRenderer() {
		super(new ToyFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
