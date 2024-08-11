package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign2DisplayModel;
import net.mcreator.fbms.block.display.LargeSign2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LargeSign2DisplayItemRenderer extends GeoItemRenderer<LargeSign2DisplayItem> {
	public LargeSign2DisplayItemRenderer() {
		super(new LargeSign2DisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeSign2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
