package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet3BlockModel;
import net.mcreator.fbms.block.entity.NeonPartySet3TileEntity;

public class NeonPartySet3TileRenderer extends GeoBlockRenderer<NeonPartySet3TileEntity> {
	public NeonPartySet3TileRenderer() {
		super(new NeonPartySet3BlockModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
