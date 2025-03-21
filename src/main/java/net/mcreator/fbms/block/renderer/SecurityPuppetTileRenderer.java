package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.SecurityPuppetBlockModel;
import net.mcreator.fbms.block.entity.SecurityPuppetTileEntity;

public class SecurityPuppetTileRenderer extends GeoBlockRenderer<SecurityPuppetTileEntity> {
	public SecurityPuppetTileRenderer() {
		super(new SecurityPuppetBlockModel());
	}

	@Override
	public RenderType getRenderType(SecurityPuppetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
