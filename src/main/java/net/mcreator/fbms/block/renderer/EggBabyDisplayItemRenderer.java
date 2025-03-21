package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.EggBabyDisplayModel;
import net.mcreator.fbms.block.display.EggBabyDisplayItem;

public class EggBabyDisplayItemRenderer extends GeoItemRenderer<EggBabyDisplayItem> {
	public EggBabyDisplayItemRenderer() {
		super(new EggBabyDisplayModel());
	}

	@Override
	public RenderType getRenderType(EggBabyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
