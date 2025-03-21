package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BonBonDisplayModel;
import net.mcreator.fbms.block.display.BonBonDisplayItem;

public class BonBonDisplayItemRenderer extends GeoItemRenderer<BonBonDisplayItem> {
	public BonBonDisplayItemRenderer() {
		super(new BonBonDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonBonDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
