package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet4BlockModel;
import net.mcreator.fbms.block.entity.FoilPartySet4TileEntity;

public class FoilPartySet4TileRenderer extends GeoBlockRenderer<FoilPartySet4TileEntity> {
	public FoilPartySet4TileRenderer() {
		super(new FoilPartySet4BlockModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet4TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
