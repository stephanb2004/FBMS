package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Springbonnie01AnimatedDisplayModel;
import net.mcreator.fbms.block.display.Springbonnie01AnimatedDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Springbonnie01AnimatedDisplayItemRenderer extends GeoItemRenderer<Springbonnie01AnimatedDisplayItem> {
	public Springbonnie01AnimatedDisplayItemRenderer() {
		super(new Springbonnie01AnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(Springbonnie01AnimatedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}