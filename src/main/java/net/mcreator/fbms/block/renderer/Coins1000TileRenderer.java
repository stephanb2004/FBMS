package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins1000BlockModel;
import net.mcreator.fbms.block.entity.Coins1000TileEntity;

public class Coins1000TileRenderer extends GeoBlockRenderer<Coins1000TileEntity> {
	public Coins1000TileRenderer() {
		super(new Coins1000BlockModel());
	}

	@Override
	public RenderType getRenderType(Coins1000TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
