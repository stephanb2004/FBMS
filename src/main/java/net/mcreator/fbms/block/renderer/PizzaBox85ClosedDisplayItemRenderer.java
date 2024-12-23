package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox85ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox85ClosedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox85ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox85ClosedDisplayItem> {
	public PizzaBox85ClosedDisplayItemRenderer() {
		super(new PizzaBox85ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox85ClosedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
