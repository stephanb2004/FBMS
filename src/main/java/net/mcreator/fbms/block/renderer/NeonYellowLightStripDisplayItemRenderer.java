package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonYellowLightStripDisplayModel;
import net.mcreator.fbms.block.display.NeonYellowLightStripDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NeonYellowLightStripDisplayItemRenderer extends GeoItemRenderer<NeonYellowLightStripDisplayItem> {
	public NeonYellowLightStripDisplayItemRenderer() {
		super(new NeonYellowLightStripDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonYellowLightStripDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
