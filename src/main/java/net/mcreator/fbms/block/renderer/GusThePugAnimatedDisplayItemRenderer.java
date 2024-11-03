package net.mcreator.fbms.block.renderer;

public class GusThePugAnimatedDisplayItemRenderer extends GeoItemRenderer<GusThePugAnimatedDisplayItem> {
	public GusThePugAnimatedDisplayItemRenderer() {
		super(new GusThePugAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(GusThePugAnimatedDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}