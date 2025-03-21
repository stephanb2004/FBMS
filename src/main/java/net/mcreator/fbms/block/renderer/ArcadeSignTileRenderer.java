package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.ArcadeSignBlockModel;
import net.mcreator.fbms.block.entity.ArcadeSignTileEntity;

public class ArcadeSignTileRenderer extends GeoBlockRenderer<ArcadeSignTileEntity> {
	public ArcadeSignTileRenderer() {
		super(new ArcadeSignBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
