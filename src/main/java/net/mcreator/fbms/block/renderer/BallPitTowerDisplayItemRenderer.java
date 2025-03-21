package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BallPitTowerDisplayModel;
import net.mcreator.fbms.block.display.BallPitTowerDisplayItem;

public class BallPitTowerDisplayItemRenderer extends GeoItemRenderer<BallPitTowerDisplayItem> {
	public BallPitTowerDisplayItemRenderer() {
		super(new BallPitTowerDisplayModel());
	}

	@Override
	public RenderType getRenderType(BallPitTowerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
