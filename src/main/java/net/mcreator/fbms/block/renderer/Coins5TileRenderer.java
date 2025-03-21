package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins5BlockModel;
import net.mcreator.fbms.block.entity.Coins5TileEntity;

public class Coins5TileRenderer extends GeoBlockRenderer<Coins5TileEntity> {
	public Coins5TileRenderer() {
		super(new Coins5BlockModel());
	}

	@Override
	public RenderType getRenderType(Coins5TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
