package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins25BlockModel;
import net.mcreator.fbms.block.entity.Coins25TileEntity;

public class Coins25TileRenderer extends GeoBlockRenderer<Coins25TileEntity> {
	public Coins25TileRenderer() {
		super(new Coins25BlockModel());
	}

	@Override
	public RenderType getRenderType(Coins25TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
