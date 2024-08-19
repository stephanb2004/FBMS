package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins5DisplayModel;
import net.mcreator.fbms.block.display.Coins5DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Coins5DisplayItemRenderer extends GeoItemRenderer<Coins5DisplayItem> {
	public Coins5DisplayItemRenderer() {
		super(new Coins5DisplayModel());
	}

	@Override
	public RenderType getRenderType(Coins5DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
