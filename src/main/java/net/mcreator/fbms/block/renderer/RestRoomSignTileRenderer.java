package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RestRoomSignBlockModel;
import net.mcreator.fbms.block.entity.RestRoomSignTileEntity;

public class RestRoomSignTileRenderer extends GeoBlockRenderer<RestRoomSignTileEntity> {
	public RestRoomSignTileRenderer() {
		super(new RestRoomSignBlockModel());
	}

	@Override
	public RenderType getRenderType(RestRoomSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
