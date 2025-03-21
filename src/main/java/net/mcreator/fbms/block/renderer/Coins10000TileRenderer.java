package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins10000BlockModel;
import net.mcreator.fbms.block.entity.Coins10000TileEntity;

public class Coins10000TileRenderer extends GeoBlockRenderer<Coins10000TileEntity> {
	public Coins10000TileRenderer() {
		super(new Coins10000BlockModel());
	}

	@Override
	public RenderType getRenderType(Coins10000TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
