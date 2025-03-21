package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet1BlockModel;
import net.mcreator.fbms.block.entity.NeonPartySet1TileEntity;

public class NeonPartySet1TileRenderer extends GeoBlockRenderer<NeonPartySet1TileEntity> {
	public NeonPartySet1TileRenderer() {
		super(new NeonPartySet1BlockModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
