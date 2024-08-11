package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FoilPartySet2DisplayModel;
import net.mcreator.fbms.block.display.FoilPartySet2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FoilPartySet2DisplayItemRenderer extends GeoItemRenderer<FoilPartySet2DisplayItem> {
	public FoilPartySet2DisplayItemRenderer() {
		super(new FoilPartySet2DisplayModel());
	}

	@Override
	public RenderType getRenderType(FoilPartySet2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
