package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox24OpenDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox24OpenDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox24OpenDisplayItemRenderer extends GeoItemRenderer<PizzaBox24OpenDisplayItem> {
	public PizzaBox24OpenDisplayItemRenderer() {
		super(new PizzaBox24OpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox24OpenDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
