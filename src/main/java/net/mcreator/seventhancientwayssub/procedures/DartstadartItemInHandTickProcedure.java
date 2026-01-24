package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModEnchantments;

public class DartstadartItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("coated") == true) {
			if ((EnchantmentHelper.getItemEnchantmentLevel(PoisonMadnessModEnchantments.COATED.get(), itemstack) != 0) == false) {
				itemstack.enchant(PoisonMadnessModEnchantments.COATED.get(), 1);
			}
			if (!(itemstack.getOrCreateTag().getDouble("coats") == 0)) {
				itemstack.setHoverName(Component.literal(("Coated Dart " + itemstack.getOrCreateTag().getDouble("coats") + " times")));
			}
			if (itemstack.getOrCreateTag().getDouble("coats") > 3) {
				itemstack.setHoverName(Component.literal(("Coated Dart " + "with no effect")));
			}
		}
	}
}
