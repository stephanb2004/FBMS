package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LadderTowerDisplayModel;
import net.mcreator.fbms.block.display.LadderTowerDisplayItem;

public class LadderTowerDisplayItemRenderer extends GeoItemRenderer<LadderTowerDisplayItem> {
	public LadderTowerDisplayItemRenderer() {
		super(new LadderTowerDisplayModel());
	}

	@Override
	public RenderType getRenderType(LadderTowerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
