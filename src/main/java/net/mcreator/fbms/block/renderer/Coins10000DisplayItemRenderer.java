package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Coins10000DisplayModel;
import net.mcreator.fbms.block.display.Coins10000DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Coins10000DisplayItemRenderer extends GeoItemRenderer<Coins10000DisplayItem> {
	public Coins10000DisplayItemRenderer() {
		super(new Coins10000DisplayModel());
	}

	@Override
	public RenderType getRenderType(Coins10000DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
