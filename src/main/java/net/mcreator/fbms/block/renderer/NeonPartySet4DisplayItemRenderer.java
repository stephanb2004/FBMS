package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet4DisplayModel;
import net.mcreator.fbms.block.display.NeonPartySet4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NeonPartySet4DisplayItemRenderer extends GeoItemRenderer<NeonPartySet4DisplayItem> {
	public NeonPartySet4DisplayItemRenderer() {
		super(new NeonPartySet4DisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
