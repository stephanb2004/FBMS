package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BalloonBoyBlockModel;
import net.mcreator.fbms.block.entity.BalloonBoyTileEntity;

public class BalloonBoyTileRenderer extends GeoBlockRenderer<BalloonBoyTileEntity> {
	public BalloonBoyTileRenderer() {
		super(new BalloonBoyBlockModel());
	}

	@Override
	public RenderType getRenderType(BalloonBoyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
