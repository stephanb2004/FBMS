package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BarryPolarFixedDisplayModel;
import net.mcreator.fbms.block.display.BarryPolarFixedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BarryPolarFixedDisplayItemRenderer extends GeoItemRenderer<BarryPolarFixedDisplayItem> {
	public BarryPolarFixedDisplayItemRenderer() {
		super(new BarryPolarFixedDisplayModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarFixedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
