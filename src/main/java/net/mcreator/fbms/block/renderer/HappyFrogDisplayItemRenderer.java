package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HappyFrogDisplayModel;
import net.mcreator.fbms.block.display.HappyFrogDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class HappyFrogDisplayItemRenderer extends GeoItemRenderer<HappyFrogDisplayItem> {
	public HappyFrogDisplayItemRenderer() {
		super(new HappyFrogDisplayModel());
	}

	@Override
	public RenderType getRenderType(HappyFrogDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
