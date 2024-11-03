package net.mcreator.fbms.block.renderer;

public class GusThePugAnimatedTileRenderer extends GeoBlockRenderer<GusThePugAnimatedTileEntity> {
	public GusThePugAnimatedTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new GusThePugAnimatedBlockModel());
	}

	@Override
	public RenderType getRenderType(GusThePugAnimatedTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}