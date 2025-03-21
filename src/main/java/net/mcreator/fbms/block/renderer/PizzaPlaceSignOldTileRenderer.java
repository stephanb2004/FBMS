package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaPlaceSignOldBlockModel;
import net.mcreator.fbms.block.entity.PizzaPlaceSignOldTileEntity;

public class PizzaPlaceSignOldTileRenderer extends GeoBlockRenderer<PizzaPlaceSignOldTileEntity> {
	public PizzaPlaceSignOldTileRenderer() {
		super(new PizzaPlaceSignOldBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaPlaceSignOldTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
