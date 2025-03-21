package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PartyRoomSignBlockModel;
import net.mcreator.fbms.block.entity.PartyRoomSignTileEntity;

public class PartyRoomSignTileRenderer extends GeoBlockRenderer<PartyRoomSignTileEntity> {
	public PartyRoomSignTileRenderer() {
		super(new PartyRoomSignBlockModel());
	}

	@Override
	public RenderType getRenderType(PartyRoomSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
