package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet2BlockModel;
import net.mcreator.fbms.block.entity.NeonPartySet2TileEntity;

public class NeonPartySet2TileRenderer extends GeoBlockRenderer<NeonPartySet2TileEntity> {
	public NeonPartySet2TileRenderer() {
		super(new NeonPartySet2BlockModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
