package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet1BlockModel;
import net.mcreator.fbms.block.entity.FoilPartySet1TileEntity;

public class FoilPartySet1TileRenderer extends GeoBlockRenderer<FoilPartySet1TileEntity> {
	public FoilPartySet1TileRenderer() {
		super(new FoilPartySet1BlockModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
