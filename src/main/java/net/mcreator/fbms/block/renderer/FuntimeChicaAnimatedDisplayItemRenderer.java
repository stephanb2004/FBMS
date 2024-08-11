package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FuntimeChicaAnimatedDisplayModel;
import net.mcreator.fbms.block.display.FuntimeChicaAnimatedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FuntimeChicaAnimatedDisplayItemRenderer extends GeoItemRenderer<FuntimeChicaAnimatedDisplayItem> {
	public FuntimeChicaAnimatedDisplayItemRenderer() {
		super(new FuntimeChicaAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(FuntimeChicaAnimatedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
