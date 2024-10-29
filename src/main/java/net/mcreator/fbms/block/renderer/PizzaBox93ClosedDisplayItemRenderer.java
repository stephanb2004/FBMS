package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.PizzaBox93ClosedDisplayModel;
import net.mcreator.fbms.block.display.PizzaBox93ClosedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PizzaBox93ClosedDisplayItemRenderer extends GeoItemRenderer<PizzaBox93ClosedDisplayItem> {
	public PizzaBox93ClosedDisplayItemRenderer() {
		super(new PizzaBox93ClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox93ClosedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
