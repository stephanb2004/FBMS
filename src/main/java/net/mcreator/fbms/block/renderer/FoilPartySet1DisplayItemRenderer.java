package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet1DisplayModel;
import net.mcreator.fbms.block.display.FoilPartySet1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoilPartySet1DisplayItemRenderer extends GeoItemRenderer<FoilPartySet1DisplayItem> {
	public FoilPartySet1DisplayItemRenderer() {
		super(new FoilPartySet1DisplayModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
