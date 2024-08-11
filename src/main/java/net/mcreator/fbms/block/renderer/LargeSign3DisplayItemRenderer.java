package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign3DisplayModel;
import net.mcreator.fbms.block.display.LargeSign3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LargeSign3DisplayItemRenderer extends GeoItemRenderer<LargeSign3DisplayItem> {
	public LargeSign3DisplayItemRenderer() {
		super(new LargeSign3DisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeSign3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
