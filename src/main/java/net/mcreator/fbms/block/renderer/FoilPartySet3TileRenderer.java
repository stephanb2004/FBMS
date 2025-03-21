package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet3BlockModel;
import net.mcreator.fbms.block.entity.FoilPartySet3TileEntity;

public class FoilPartySet3TileRenderer extends GeoBlockRenderer<FoilPartySet3TileEntity> {
	public FoilPartySet3TileRenderer() {
		super(new FoilPartySet3BlockModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
