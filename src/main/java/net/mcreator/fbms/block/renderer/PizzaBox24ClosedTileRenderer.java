package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox24ClosedBlockModel;
import net.mcreator.fbms.block.entity.PizzaBox24ClosedTileEntity;

public class PizzaBox24ClosedTileRenderer extends GeoBlockRenderer<PizzaBox24ClosedTileEntity> {
	public PizzaBox24ClosedTileRenderer() {
		super(new PizzaBox24ClosedBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox24ClosedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
