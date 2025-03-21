package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.MoltenFreddyDisplayModel;
import net.mcreator.fbms.block.display.MoltenFreddyDisplayItem;

public class MoltenFreddyDisplayItemRenderer extends GeoItemRenderer<MoltenFreddyDisplayItem> {
	public MoltenFreddyDisplayItemRenderer() {
		super(new MoltenFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(MoltenFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
