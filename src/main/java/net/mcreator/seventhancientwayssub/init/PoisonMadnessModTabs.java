
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoisonMadnessMod.MODID);
	public static final RegistryObject<CreativeModeTab> PICK_YOUR_POISON = REGISTRY.register("pick_your_poison",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.poison_madness.pick_your_poison")).icon(() -> new ItemStack(PoisonMadnessModItems.COMMON_FROG_BOWL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PoisonMadnessModItems.GOLDEN_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.BLUE_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.ORANGE_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.CRIMSON_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.RED_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.GEEN_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.PINK_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.VIOLET_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.DARK_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.CYAN_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.COMMON_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.DARK_PURPLE_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.YELLOW_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.RED_WHITE_FROG_BOWL.get());
				tabData.accept(PoisonMadnessModItems.BLACK_LIZARD_BOWL.get());
				tabData.accept(PoisonMadnessModItems.BLACK_2_LIZARD_BOWL.get());
				tabData.accept(PoisonMadnessModItems.BROWN_LIZARD_BOWL.get());
				tabData.accept(PoisonMadnessModItems.GREEN_TOAD_BOWL.get());
				tabData.accept(PoisonMadnessModItems.BLACK_SPIDER_BOWL.get());
				tabData.accept(PoisonMadnessModItems.DARTSTADART.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_GOLDEN_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_BLUE_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_ORANGE_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_CRIMSON_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_RED_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_GREEN_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_PINK_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_DARK_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_VIOLET_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_CYAN_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_COMMON_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_DARK_PURPLE_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_YELLOW_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.LIZARD_BLACK_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.GREEN_TOAD_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.SPIDER_BLACK_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.COATED_DART.get());
				tabData.accept(PoisonMadnessModBlocks.RITUAL_TABLE_CENTER.get().asItem());
				tabData.accept(PoisonMadnessModItems.POISON_FROG_RED_WHITE_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModBlocks.POISON_CRAFT_TABLE.get().asItem());
				tabData.accept(PoisonMadnessModItems.LIZARD_BLACK_2_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.LIZARD_BROWN_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.LIGHT_GREEN_TOAD_SPAWN_EGG.get());
				tabData.accept(PoisonMadnessModItems.LIGHT_GREEN_TOAD_BOWL.get());
			})

					.build());
}
