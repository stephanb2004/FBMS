package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RestRoomSignDisplayModel;
import net.mcreator.fbms.block.display.RestRoomSignDisplayItem;

public class RestRoomSignDisplayItemRenderer extends GeoItemRenderer<RestRoomSignDisplayItem> {
	public RestRoomSignDisplayItemRenderer() {
		super(new RestRoomSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(RestRoomSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
