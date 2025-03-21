package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox87ClosedBlockModel;
import net.mcreator.fbms.block.entity.PizzaBox87ClosedTileEntity;

public class PizzaBox87ClosedTileRenderer extends GeoBlockRenderer<PizzaBox87ClosedTileEntity> {
	public PizzaBox87ClosedTileRenderer() {
		super(new PizzaBox87ClosedBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox87ClosedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
