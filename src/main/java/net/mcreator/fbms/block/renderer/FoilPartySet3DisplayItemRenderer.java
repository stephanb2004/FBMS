package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet3DisplayModel;
import net.mcreator.fbms.block.display.FoilPartySet3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoilPartySet3DisplayItemRenderer extends GeoItemRenderer<FoilPartySet3DisplayItem> {
	public FoilPartySet3DisplayItemRenderer() {
		super(new FoilPartySet3DisplayModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
