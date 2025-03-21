package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BrokenFreddyBlockModel;
import net.mcreator.fbms.block.entity.BrokenFreddyTileEntity;

public class BrokenFreddyTileRenderer extends GeoBlockRenderer<BrokenFreddyTileEntity> {
	public BrokenFreddyTileRenderer() {
		super(new BrokenFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(BrokenFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
