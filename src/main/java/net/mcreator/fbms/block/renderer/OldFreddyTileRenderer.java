package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.OldFreddyBlockModel;
import net.mcreator.fbms.block.entity.OldFreddyTileEntity;

public class OldFreddyTileRenderer extends GeoBlockRenderer<OldFreddyTileEntity> {
	public OldFreddyTileRenderer() {
		super(new OldFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(OldFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
