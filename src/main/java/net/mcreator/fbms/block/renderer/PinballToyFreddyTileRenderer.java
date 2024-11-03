package net.mcreator.fbms.block.renderer;

public class PinballToyFreddyTileRenderer extends GeoBlockRenderer<PinballToyFreddyTileEntity> {
	public PinballToyFreddyTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new PinballToyFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(PinballToyFreddyTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}