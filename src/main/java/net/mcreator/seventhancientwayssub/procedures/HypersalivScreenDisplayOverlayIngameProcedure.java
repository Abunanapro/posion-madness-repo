package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

public class HypersalivScreenDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PoisonMadnessModMobEffects.HYPERSALIVATION.get())) {
			return true;
		}
		return false;
	}
}
