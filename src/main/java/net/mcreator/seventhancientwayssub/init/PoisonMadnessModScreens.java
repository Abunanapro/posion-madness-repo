
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.seventhancientwayssub.client.gui.PoisonCraftGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PoisonMadnessModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PoisonMadnessModMenus.POISON_CRAFT_GUI.get(), PoisonCraftGUIScreen::new);
		});
	}
}
