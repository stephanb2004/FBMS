package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet2BlockModel;
import net.mcreator.fbms.block.entity.FoilPartySet2TileEntity;

public class FoilPartySet2TileRenderer extends GeoBlockRenderer<FoilPartySet2TileEntity> {
	public FoilPartySet2TileRenderer() {
		super(new FoilPartySet2BlockModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
