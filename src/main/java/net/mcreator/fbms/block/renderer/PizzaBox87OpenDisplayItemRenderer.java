package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox87OpenDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox87OpenDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox87OpenDisplayItemRenderer extends GeoItemRenderer<PizzaBox87OpenDisplayItem> {
	public PizzaBox87OpenDisplayItemRenderer() {
		super(new PizzaBox87OpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox87OpenDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
