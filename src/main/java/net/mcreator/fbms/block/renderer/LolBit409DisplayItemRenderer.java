package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LolBit409DisplayModel;
import net.mcreator.fbms.block.display.LolBit409DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LolBit409DisplayItemRenderer extends GeoItemRenderer<LolBit409DisplayItem> {
	public LolBit409DisplayItemRenderer() {
		super(new LolBit409DisplayModel());
	}

	@Override
	public RenderType getRenderType(LolBit409DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
