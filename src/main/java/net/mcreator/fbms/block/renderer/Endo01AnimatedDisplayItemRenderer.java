package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Endo01AnimatedDisplayModel;
import net.mcreator.fbms.block.display.Endo01AnimatedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Endo01AnimatedDisplayItemRenderer extends GeoItemRenderer<Endo01AnimatedDisplayItem> {
	public Endo01AnimatedDisplayItemRenderer() {
		super(new Endo01AnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01AnimatedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
