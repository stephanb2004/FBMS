package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.StationWagonBlockDisplayModel;
import net.mcreator.fbms.block.display.StationWagonBlockDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StationWagonBlockDisplayItemRenderer extends GeoItemRenderer<StationWagonBlockDisplayItem> {
	public StationWagonBlockDisplayItemRenderer() {
		super(new StationWagonBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(StationWagonBlockDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
