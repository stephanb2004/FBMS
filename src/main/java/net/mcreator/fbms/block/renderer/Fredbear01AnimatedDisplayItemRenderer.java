package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Fredbear01AnimatedDisplayModel;
import net.mcreator.fbms.block.display.Fredbear01AnimatedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Fredbear01AnimatedDisplayItemRenderer extends GeoItemRenderer<Fredbear01AnimatedDisplayItem> {
	public Fredbear01AnimatedDisplayItemRenderer() {
		super(new Fredbear01AnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01AnimatedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
