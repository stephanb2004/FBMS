package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DBalloonBoyDisplayModel;
import net.mcreator.fbms.block.display.DBalloonBoyDisplayItem;

public class DBalloonBoyDisplayItemRenderer extends GeoItemRenderer<DBalloonBoyDisplayItem> {
	public DBalloonBoyDisplayItemRenderer() {
		super(new DBalloonBoyDisplayModel());
	}

	@Override
	public RenderType getRenderType(DBalloonBoyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
