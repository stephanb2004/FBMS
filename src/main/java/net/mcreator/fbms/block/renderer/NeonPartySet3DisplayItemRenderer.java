package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet3DisplayModel;
import net.mcreator.fbms.block.display.NeonPartySet3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NeonPartySet3DisplayItemRenderer extends GeoItemRenderer<NeonPartySet3DisplayItem> {
	public NeonPartySet3DisplayItemRenderer() {
		super(new NeonPartySet3DisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
