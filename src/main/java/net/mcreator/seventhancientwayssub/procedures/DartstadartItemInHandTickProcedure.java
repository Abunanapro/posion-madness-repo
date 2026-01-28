package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

public class DartstadartItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("coated") == true) {
			if (!(itemstack.getOrCreateTag().getDouble("coats") == 0)) {
				itemstack.setHoverName(Component.literal(("Coated Dart " + itemstack.getOrCreateTag().getDouble("coats") + " times")));
			}
			if (itemstack.getOrCreateTag().getDouble("coats") > 3) {
				itemstack.setHoverName(Component.literal(("Coated Dart " + "with no effect")));
			}
		}
	}
}
