package net.mcreator.fbms.block.renderer;

public class PinballToyFreddyDisplayItemRenderer extends GeoItemRenderer<PinballToyFreddyDisplayItem> {
	public PinballToyFreddyDisplayItemRenderer() {
		super(new PinballToyFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinballToyFreddyDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}