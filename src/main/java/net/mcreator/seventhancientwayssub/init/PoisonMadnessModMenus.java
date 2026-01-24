
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.seventhancientwayssub.world.inventory.PoisonCraftGUIMenu;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PoisonMadnessMod.MODID);
	public static final RegistryObject<MenuType<PoisonCraftGUIMenu>> POISON_CRAFT_GUI = REGISTRY.register("poison_craft_gui", () -> IForgeMenuType.create(PoisonCraftGUIMenu::new));
}
