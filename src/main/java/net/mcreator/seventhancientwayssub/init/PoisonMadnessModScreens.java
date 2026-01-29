
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.seventhancientwayssub.client.gui.Toads1Screen;
import net.mcreator.seventhancientwayssub.client.gui.PoisonCraftGUIScreen;
import net.mcreator.seventhancientwayssub.client.gui.Lizard2Screen;
import net.mcreator.seventhancientwayssub.client.gui.Lizard1Screen;
import net.mcreator.seventhancientwayssub.client.gui.IndexScreen;
import net.mcreator.seventhancientwayssub.client.gui.Index2Screen;
import net.mcreator.seventhancientwayssub.client.gui.Frogs1Screen;
import net.mcreator.seventhancientwayssub.client.gui.Frog7Screen;
import net.mcreator.seventhancientwayssub.client.gui.Frog6Screen;
import net.mcreator.seventhancientwayssub.client.gui.Frog5Screen;
import net.mcreator.seventhancientwayssub.client.gui.Frog4Screen;
import net.mcreator.seventhancientwayssub.client.gui.Frog3Screen;
import net.mcreator.seventhancientwayssub.client.gui.Frog2Screen;
import net.mcreator.seventhancientwayssub.client.gui.ComingSoonScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PoisonMadnessModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PoisonMadnessModMenus.POISON_CRAFT_GUI.get(), PoisonCraftGUIScreen::new);
			MenuScreens.register(PoisonMadnessModMenus.INDEX1.get(), IndexScreen::new);
			MenuScreens.register(PoisonMadnessModMenus.INDEX_2.get(), Index2Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.FROGS_1.get(), Frogs1Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.FROG_2.get(), Frog2Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.FROG_3.get(), Frog3Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.FROG_4.get(), Frog4Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.FROG_5.get(), Frog5Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.FROG_6.get(), Frog6Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.FROG_7.get(), Frog7Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.LIZARD_1.get(), Lizard1Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.LIZARD_2.get(), Lizard2Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.TOADS_1.get(), Toads1Screen::new);
			MenuScreens.register(PoisonMadnessModMenus.COMING_SOON.get(), ComingSoonScreen::new);
		});
	}
}
