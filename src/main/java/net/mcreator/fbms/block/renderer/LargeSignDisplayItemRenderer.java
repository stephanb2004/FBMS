package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSignDisplayModel;
import net.mcreator.fbms.block.display.LargeSignDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LargeSignDisplayItemRenderer extends GeoItemRenderer<LargeSignDisplayItem> {
	public LargeSignDisplayItemRenderer() {
		super(new LargeSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeSignDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
