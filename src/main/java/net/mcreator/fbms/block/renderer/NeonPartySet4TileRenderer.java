package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet4BlockModel;
import net.mcreator.fbms.block.entity.NeonPartySet4TileEntity;

public class NeonPartySet4TileRenderer extends GeoBlockRenderer<NeonPartySet4TileEntity> {
	public NeonPartySet4TileRenderer() {
		super(new NeonPartySet4BlockModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet4TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
