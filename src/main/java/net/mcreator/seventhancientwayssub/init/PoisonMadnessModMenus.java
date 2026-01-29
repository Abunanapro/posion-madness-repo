
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.seventhancientwayssub.world.inventory.Toads1Menu;
import net.mcreator.seventhancientwayssub.world.inventory.PoisonCraftGUIMenu;
import net.mcreator.seventhancientwayssub.world.inventory.Lizard2Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Lizard1Menu;
import net.mcreator.seventhancientwayssub.world.inventory.IndexMenu;
import net.mcreator.seventhancientwayssub.world.inventory.Index2Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Frogs1Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Frog7Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Frog6Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Frog5Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Frog4Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Frog3Menu;
import net.mcreator.seventhancientwayssub.world.inventory.Frog2Menu;
import net.mcreator.seventhancientwayssub.world.inventory.ComingSoonMenu;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PoisonMadnessMod.MODID);
	public static final RegistryObject<MenuType<PoisonCraftGUIMenu>> POISON_CRAFT_GUI = REGISTRY.register("poison_craft_gui", () -> IForgeMenuType.create(PoisonCraftGUIMenu::new));
	public static final RegistryObject<MenuType<IndexMenu>> INDEX1 = REGISTRY.register("index1", () -> IForgeMenuType.create(IndexMenu::new));
	public static final RegistryObject<MenuType<Index2Menu>> INDEX_2 = REGISTRY.register("index_2", () -> IForgeMenuType.create(Index2Menu::new));
	public static final RegistryObject<MenuType<Frogs1Menu>> FROGS_1 = REGISTRY.register("frogs_1", () -> IForgeMenuType.create(Frogs1Menu::new));
	public static final RegistryObject<MenuType<Frog2Menu>> FROG_2 = REGISTRY.register("frog_2", () -> IForgeMenuType.create(Frog2Menu::new));
	public static final RegistryObject<MenuType<Frog3Menu>> FROG_3 = REGISTRY.register("frog_3", () -> IForgeMenuType.create(Frog3Menu::new));
	public static final RegistryObject<MenuType<Frog4Menu>> FROG_4 = REGISTRY.register("frog_4", () -> IForgeMenuType.create(Frog4Menu::new));
	public static final RegistryObject<MenuType<Frog5Menu>> FROG_5 = REGISTRY.register("frog_5", () -> IForgeMenuType.create(Frog5Menu::new));
	public static final RegistryObject<MenuType<Frog6Menu>> FROG_6 = REGISTRY.register("frog_6", () -> IForgeMenuType.create(Frog6Menu::new));
	public static final RegistryObject<MenuType<Frog7Menu>> FROG_7 = REGISTRY.register("frog_7", () -> IForgeMenuType.create(Frog7Menu::new));
	public static final RegistryObject<MenuType<Lizard1Menu>> LIZARD_1 = REGISTRY.register("lizard_1", () -> IForgeMenuType.create(Lizard1Menu::new));
	public static final RegistryObject<MenuType<Lizard2Menu>> LIZARD_2 = REGISTRY.register("lizard_2", () -> IForgeMenuType.create(Lizard2Menu::new));
	public static final RegistryObject<MenuType<Toads1Menu>> TOADS_1 = REGISTRY.register("toads_1", () -> IForgeMenuType.create(Toads1Menu::new));
	public static final RegistryObject<MenuType<ComingSoonMenu>> COMING_SOON = REGISTRY.register("coming_soon", () -> IForgeMenuType.create(ComingSoonMenu::new));
}
