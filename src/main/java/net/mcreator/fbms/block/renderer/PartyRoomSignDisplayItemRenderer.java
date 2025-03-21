package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PartyRoomSignDisplayModel;
import net.mcreator.fbms.block.display.PartyRoomSignDisplayItem;

public class PartyRoomSignDisplayItemRenderer extends GeoItemRenderer<PartyRoomSignDisplayItem> {
	public PartyRoomSignDisplayItemRenderer() {
		super(new PartyRoomSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(PartyRoomSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
