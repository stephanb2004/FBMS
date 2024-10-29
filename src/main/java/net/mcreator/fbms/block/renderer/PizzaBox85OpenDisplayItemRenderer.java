package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox85OpenDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox85OpenDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox85OpenDisplayItemRenderer extends GeoItemRenderer<PizzaBox85OpenDisplayItem> {
	public PizzaBox85OpenDisplayItemRenderer() {
		super(new PizzaBox85OpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox85OpenDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
