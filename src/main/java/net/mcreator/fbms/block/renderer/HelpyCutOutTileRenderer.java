package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.HelpyCutOutBlockModel;
import net.mcreator.fbms.block.entity.HelpyCutOutTileEntity;

public class HelpyCutOutTileRenderer extends GeoBlockRenderer<HelpyCutOutTileEntity> {
	public HelpyCutOutTileRenderer() {
		super(new HelpyCutOutBlockModel());
	}

	@Override
	public RenderType getRenderType(HelpyCutOutTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
