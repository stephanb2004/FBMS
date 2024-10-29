package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox24ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox24ClosedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox24ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox24ClosedDisplayItem> {
	public PizzaBox24ClosedDisplayItemRenderer() {
		super(new PizzaBox24ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox24ClosedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
