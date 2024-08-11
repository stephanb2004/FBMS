package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.NeonPartySet1DisplayModel;
import net.mcreator.fbms.block.display.NeonPartySet1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NeonPartySet1DisplayItemRenderer extends GeoItemRenderer<NeonPartySet1DisplayItem> {
	public NeonPartySet1DisplayItemRenderer() {
		super(new NeonPartySet1DisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonPartySet1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
