
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fbms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fbms.client.model.Modela;
import net.mcreator.fbms.client.model.ModelFredbearMask;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FbmsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modela.LAYER_LOCATION, Modela::createBodyLayer);
		event.registerLayerDefinition(ModelFredbearMask.LAYER_LOCATION, ModelFredbearMask::createBodyLayer);
	}
}
