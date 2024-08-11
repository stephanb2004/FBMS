
package net.mcreator.fbms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.fbms.entity.SeatEntity;
import net.mcreator.fbms.client.model.Modela;

public class SeatRenderer extends MobRenderer<SeatEntity, Modela<SeatEntity>> {
	public SeatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modela(context.bakeLayer(Modela.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeatEntity entity) {
		return new ResourceLocation("fbms:textures/entities/seat.png");
	}
}
