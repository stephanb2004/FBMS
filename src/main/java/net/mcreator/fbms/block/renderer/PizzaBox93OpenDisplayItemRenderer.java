package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox93OpenDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox93OpenDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox93OpenDisplayItemRenderer extends GeoItemRenderer<PizzaBox93OpenDisplayItem> {
	public PizzaBox93OpenDisplayItemRenderer() {
		super(new PizzaBox93OpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox93OpenDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
