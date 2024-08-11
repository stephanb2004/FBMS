package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign4DisplayModel;
import net.mcreator.fbms.block.display.LargeSign4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LargeSign4DisplayItemRenderer extends GeoItemRenderer<LargeSign4DisplayItem> {
	public LargeSign4DisplayItemRenderer() {
		super(new LargeSign4DisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeSign4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
