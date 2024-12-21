package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.Fredbear01DisplayModel;
import net.mcreator.fbms.block.display.Fredbear01DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Fredbear01DisplayItemRenderer extends GeoItemRenderer<Fredbear01DisplayItem> {
	public Fredbear01DisplayItemRenderer() {
		super(new Fredbear01DisplayModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
