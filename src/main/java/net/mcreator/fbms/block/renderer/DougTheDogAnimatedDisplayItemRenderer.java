package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DougTheDogAnimatedDisplayModel;
import net.mcreator.fbms.block.display.DougTheDogAnimatedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DougTheDogAnimatedDisplayItemRenderer extends GeoItemRenderer<DougTheDogAnimatedDisplayItem> {
	public DougTheDogAnimatedDisplayItemRenderer() {
		super(new DougTheDogAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(DougTheDogAnimatedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
