package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DeluxeSpeakerSetDisplayModel;
import net.mcreator.fbms.block.display.DeluxeSpeakerSetDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class DeluxeSpeakerSetDisplayItemRenderer extends GeoItemRenderer<DeluxeSpeakerSetDisplayItem> {
	public DeluxeSpeakerSetDisplayItemRenderer() {
		super(new DeluxeSpeakerSetDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeluxeSpeakerSetDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
