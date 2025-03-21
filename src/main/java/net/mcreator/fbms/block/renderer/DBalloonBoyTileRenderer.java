package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DBalloonBoyBlockModel;
import net.mcreator.fbms.block.entity.DBalloonBoyTileEntity;

public class DBalloonBoyTileRenderer extends GeoBlockRenderer<DBalloonBoyTileEntity> {
	public DBalloonBoyTileRenderer() {
		super(new DBalloonBoyBlockModel());
	}

	@Override
	public RenderType getRenderType(DBalloonBoyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
