package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins100DisplayModel;
import net.mcreator.fbms.block.display.Coins100DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Coins100DisplayItemRenderer extends GeoItemRenderer<Coins100DisplayItem> {
	public Coins100DisplayItemRenderer() {
		super(new Coins100DisplayModel());
	}

	@Override
	public RenderType getRenderType(Coins100DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
