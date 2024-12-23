package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Springbonnie01DisplayModel;
import net.mcreator.fbms.block.display.Springbonnie01DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Springbonnie01DisplayItemRenderer extends GeoItemRenderer<Springbonnie01DisplayItem> {
	public Springbonnie01DisplayItemRenderer() {
		super(new Springbonnie01DisplayModel());
	}

	@Override
	public RenderType getRenderType(Springbonnie01DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
