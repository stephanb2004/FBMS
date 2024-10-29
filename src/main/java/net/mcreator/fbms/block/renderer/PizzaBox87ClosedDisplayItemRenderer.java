package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox87ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox87ClosedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox87ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox87ClosedDisplayItem> {
	public PizzaBox87ClosedDisplayItemRenderer() {
		super(new PizzaBox87ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox87ClosedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
