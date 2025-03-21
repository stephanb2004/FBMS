package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins100BlockModel;
import net.mcreator.fbms.block.entity.Coins100TileEntity;

public class Coins100TileRenderer extends GeoBlockRenderer<Coins100TileEntity> {
	public Coins100TileRenderer() {
		super(new Coins100BlockModel());
	}

	@Override
	public RenderType getRenderType(Coins100TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
