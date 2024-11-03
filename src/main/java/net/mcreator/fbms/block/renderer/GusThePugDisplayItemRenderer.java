package net.mcreator.fbms.block.renderer;

public class GusThePugDisplayItemRenderer extends GeoItemRenderer<GusThePugDisplayItem> {
	public GusThePugDisplayItemRenderer() {
		super(new GusThePugDisplayModel());
	}

	@Override
	public RenderType getRenderType(GusThePugDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}