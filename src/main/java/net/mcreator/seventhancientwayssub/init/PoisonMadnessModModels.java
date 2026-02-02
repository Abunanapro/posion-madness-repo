
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.seventhancientwayssub.client.model.Modelfrojectile;
import net.mcreator.seventhancientwayssub.client.model.Modeldart;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PoisonMadnessModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelfrojectile.LAYER_LOCATION, Modelfrojectile::createBodyLayer);
		event.registerLayerDefinition(Modeldart.LAYER_LOCATION, Modeldart::createBodyLayer);
	}
}
