
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.seventhancientwayssub.enchantment.CoatedEnchantment;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, PoisonMadnessMod.MODID);
	public static final RegistryObject<Enchantment> COATED = REGISTRY.register("coated", () -> new CoatedEnchantment());
}
