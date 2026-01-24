package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModEnchantments;

public class DartstadartPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		double coated = 0;
		if (!((EnchantmentHelper.getItemEnchantmentLevel(PoisonMadnessModEnchantments.COATED.get(), itemstack) != 0) == true)) {
			return 0;
		}
		return 1;
	}
}
