package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

public class NeuroToxinGuiDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean t = false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PoisonMadnessModMobEffects.NEUROTOXIN.get())) {
			t = true;
		} else {
			t = false;
		}
		return t;
	}
}
